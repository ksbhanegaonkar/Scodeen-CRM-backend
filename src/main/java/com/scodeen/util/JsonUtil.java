package com.scodeen.util;

import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.bouncycastle.jcajce.provider.asymmetric.dsa.DSASigner.noneDSA;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.scodeen.entity.Batch;
import com.scodeen.entity.CandidateDetails;
import com.scodeen.model.CandidateSearchModel;

public class JsonUtil {
	
	private static ObjectMapper mapper = new ObjectMapper();


	
	
	public static String getJsonValue(String json,String key) {
		try {
			JsonNode node = mapper.readTree(json);
			return node.get(key).asText();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
	
	public static ArrayNode createJsonArray(List<String> values) {
		ArrayNode arrayNode = mapper.createArrayNode();
		values.forEach(v->arrayNode.add(v));
		return arrayNode;
	
	}
	
	public static ObjectNode getEmptyJsonObject() {
		return mapper.createObjectNode();
	}
	
	public static ObjectNode getJsonObjectFromMap(Map<String,String> map) {
		ObjectNode obj = getEmptyJsonObject();
		for(String key : map.keySet()) {
			obj.put(key, map.get(key));
		}
		return obj;
	}
	
	public static ObjectNode getJsonObjectFromObjectMap(Map<String,Map<String,String>> map) {
		ObjectNode obj = getEmptyJsonObject();
		for(String key : map.keySet()) {
			obj.set(key, getJsonObjectFromMap(map.get(key)));
		}
		return obj;
	}
	
	
	public static ObjectNode getJsonObjectFromListMap(Map<String,List<String>> map) {
		ObjectNode obj = getEmptyJsonObject();
		for(String key : map.keySet()) {
			obj.set(key, createJsonArray(map.get(key)));
		}
		return obj;
	}
	

	
	public static CandidateDetails getCandidateDetailsFromRequest(ObjectNode data) {
		CandidateDetails candidateDetails = new CandidateDetails();
		
		candidateDetails.setFirstName(data.get("fname")!=null?data.get("fname").asText():null);
		candidateDetails.setLastName(data.get("lname")!=null?data.get("lname").asText():null);
		candidateDetails.setMiddleName(data.get("mname")!=null?data.get("mname").asText():null);
		candidateDetails.setContactNumber(data.get("contactNumber")!=null?data.get("contactNumber").asText():null);
		candidateDetails.setEmail(data.get("email")!=null?data.get("email").asText():null);
		candidateDetails.setAddress(data.get("address")!=null?data.get("address").asText():null);
		candidateDetails.setCity(data.get("city")!=null?data.get("city").asText():null);
		candidateDetails.setIsRegistered(0);
		candidateDetails.setIsWorking(0);
		candidateDetails.setWorkingField(data.get("workingField")!=null?data.get("workingField").asText():null);
		candidateDetails.setEnquiryDate(new Date(System.currentTimeMillis()));
		candidateDetails.setRegisterDate(new Date(System.currentTimeMillis()));
		candidateDetails.setRemarks("Very good");
		candidateDetails.setCreatedOn(new Date(System.currentTimeMillis()));
		candidateDetails.setModifiedOn(new Date(System.currentTimeMillis()));
		candidateDetails.setCreatedBy(15);
		candidateDetails.setModifiedBy(15);
		

		
		return candidateDetails;
	}
	
	public static ObjectNode getCandidateDetailAsJsonObject(CandidateDetails cd) {
//	    fname : string;
//	    mname : string;
//	    lname : string;
//	    enrolledbatches : any;
//	    contactNumber : string; 
//	    email : string;
//	    city:string;
//	    isRegistered : number;
//	    isWorking : number;
//	    workingField : string;
//	    enquiryDate : number;
//	    registerDate : number;
//	    address:string;
		ObjectNode n = mapper.createObjectNode();
		n.put("fname", cd.getFirstName());
		n.put("mname", cd.getMiddleName());
		n.put("lname", cd.getLastName());
		n.put("contactNumber",cd.getContactNumber() );
		n.put("email",cd.getEmail() );
		n.put("city",cd.getCity() );
		n.put("isRegistered",cd.getIsRegistered() );
		n.put("isWorking",cd.getIsWorking() );
		n.put("workingField",cd.getWorkingField() );
		n.put("enquiryDate",cd.getEnquiryDate().toString());
		n.put("registerDate",cd.getIsRegistered() );
		n.put("address",cd.getAddress() );
		n.set("enrolledbatches",getBatchJsonListFromBatchList(cd.getBatches()));
	
		return n;
	}
	


	public static ArrayNode getBatchJsonListFromBatchList(List<Batch> batches) {
		ArrayNode arrayNode = mapper.createArrayNode();
		for(int i=0;i<batches.size();i++) {
			ObjectNode node = mapper.createObjectNode();
			node.put("item_id", i+1);
			node.put("item_text",batches.get(i).getBatchName());
			arrayNode.add(node);
		}
		return arrayNode;
	}
	
	public static ArrayNode getCandidateSearchJsonListFromCandidateList(List<CandidateDetails> candidateDetails) {
		
		ArrayNode arrayNode = mapper.createArrayNode();
		for(CandidateDetails candidate : candidateDetails) {
			arrayNode.add(getCandidateDetailAsSearchJsonObject(candidate));
		}
		return arrayNode;
	}
	
	
	public static ObjectNode getCandidateDetailAsSearchJsonObject(CandidateDetails c) {
		ObjectNode node = mapper.createObjectNode();
		node.put("name", c.getFirstName()+" "+c.getLastName());
		node.put("isregistered", c.getIsRegistered());
		node.put("batch", "Test batch");
		return node;
	}
	
	public static List<String> getBatchNameListFromBatchJsonArray(ArrayNode arrayNode){
		List<String> batchIdList = new ArrayList<>();
		for(JsonNode node : arrayNode) {
			batchIdList.add(node.get("item_text").asText());
		}
		return batchIdList;
	}
	
	public static ArrayNode getSearchCandidateModelListAsJsonArray(List<CandidateSearchModel> c) {
		ArrayNode n = mapper.createArrayNode();
		for(CandidateSearchModel cd : c) {
			n.add(createJsonObjectFromCandidateSearchModel(cd));
		}
		return n;
	}
	public static ObjectNode createJsonObjectFromCandidateSearchModel(CandidateSearchModel c) {
		ObjectNode n = mapper.createObjectNode();
		n.put("id", c.getId());
		n.put("name", c.getName());
		n.put("batch",c.getBatchName());
		n.put("isregistered", c.getIsRegistered());
		return n;
	}

	public static List<String> getBatchNamesFromCandidateDetails(ObjectNode data) {
		ArrayNode batchesList = (ArrayNode) data.get("enrolledbatches");
		return getBatchNameListFromBatchJsonArray(batchesList);
	}
	
}


