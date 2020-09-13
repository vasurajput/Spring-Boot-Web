package com.javadream.jsonparser.controller;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonParserController {

	private static final Logger logger = LoggerFactory.getLogger(JsonParserController.class);

	private JSONParser parser = new JSONParser();

	@PostMapping("/parseSimpleJson")
	public String parser(@RequestBody String payload) {
		try {
			logger.info("payload= " + payload);
			JSONObject jObj = (JSONObject) parser.parse(payload);
			String name = jObj.get("name").toString();
			String age = jObj.get("age").toString();
			String email = jObj.get("email").toString();

			logger.info("name= " + name + " ,age= " + age + " ,email= " + email);
			return "Your name is " + name + " and you are " + age + " old. Your email id is" + email;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return "Parse Error Try Again";
		}
	}

	@PostMapping("/parserComplexJson")
	public String parserComplexJson(@RequestBody String payload) {
		try {
			logger.info("payload= " + payload);
			JSONObject jObj = (JSONObject) parser.parse(payload);
			String name = jObj.get("name").toString();
			String age = jObj.get("age").toString();
			String email = jObj.get("email").toString();

			JSONObject educationObj = (JSONObject) jObj.get("educationDetail");
			String collegeName = educationObj.get("college").toString();
			String course = educationObj.get("course").toString();
			String branch = educationObj.get("Branch").toString();

			return "Hi " + name + " you are student of " + collegeName + " college and your course is " + course;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return "Parse Error Try Again";
		}
	}

	@PostMapping("/parserHardJson")
	public String parserHardJson(@RequestBody String payload) {
		try {
			logger.info("payload= " + payload);
			JSONObject jObj = (JSONObject) parser.parse(payload);
			String name = jObj.get("name").toString();
			String age = jObj.get("age").toString();
			String email = jObj.get("email").toString();

			JSONObject educationObj = (JSONObject) jObj.get("educationDetail");
			String collegeName = educationObj.get("college").toString();
			String course = educationObj.get("course").toString();
			String branch = educationObj.get("Branch").toString();

			JSONArray matrixDetail = (JSONArray) jObj.get("matrixEducation");
			
			JSONObject highSchoolObj = (JSONObject)matrixDetail.get(0);
			String highSchoolboard = highSchoolObj.get("10ClassBoard").toString();
			
			JSONObject interSchoolObj = (JSONObject)matrixDetail.get(1);
			String interSchoolboard = interSchoolObj.get("12ClassBoard").toString();
			

			return "Hi " + name + " you 10 board is  " + highSchoolboard + " and for 12 is  " + interSchoolboard;
		} catch (Exception e) {
			logger.error(e.getMessage());
			return "Parse Error Try Again";
		}
	}
}
