package com.scodeen.util;

import java.io.IOException;
import java.sql.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.scodeen.entity.CandidateDetails;

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
		
		candidateDetails.setFirstName(data.get("fname").asText());
		candidateDetails.setLastName(data.get("lname").asText());
		candidateDetails.setMiddleName(data.get("mname").asText());
		candidateDetails.setCourseId(2);
		candidateDetails.setBatchId(2);
		candidateDetails.setContactNumber(new Date(System.currentTimeMillis()));
		candidateDetails.setEmail("testmail");
		candidateDetails.setCityId(2);
		candidateDetails.setIsRegistered(0);
		candidateDetails.setIsWorking(0);
		candidateDetails.setWorkingField(0);
		candidateDetails.setEnquiryDate(new Date(System.currentTimeMillis()));
		candidateDetails.setRegisterDate(new Date(System.currentTimeMillis()));
		candidateDetails.setRemarks("Very good");
		candidateDetails.setCreatedOn(new Date(System.currentTimeMillis()));
		candidateDetails.setModifiedOn(new Date(System.currentTimeMillis()));
		candidateDetails.setCreatedBy(15);
		candidateDetails.setModifiedBy(15);
		
		return candidateDetails;
	}


	
	
}


