package com.sapient.repository;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.sapient.dto.Data;

/** 
 * 
 * @author shrshrir
 *
 */
public class RepositoryMongoDBImpl implements IRepository {

	/* (non-Javadoc)
	 * @see com.sapient.repository.IRepository#save(com.sapient.dto.Data)
	 */
	@Override
	public void save(Data data) {
		
		// Creating a Mongo client
		MongoClient mongo = new MongoClient("localhost", 27017);

		// Accessing the database
		MongoDatabase database = mongo.getDatabase("sapient");

		MongoCollection<Document> collection = database.getCollection("User");

		// writing to db
		Document document = new Document("name", data.getName())
				.append("age", data.getAge())
				.append("salary", data.getSalary());
		collection.insertOne(document);

		// closing connection
		mongo.close();

	}
	
}
