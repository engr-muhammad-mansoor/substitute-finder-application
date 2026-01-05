//package com.example.subfinder;
//
//import com.amazonaws.services.dynamodbv2.AmazonDynamoDB;
//
//import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
//import com.example.subfinder.Entities.UserTable;
//import com.example.subfinder.Repositories.UserTableRepository;
//import com.amazonaws.services.dynamodbv2.model.CreateTableRequest;
//import com.amazonaws.services.dynamodbv2.model.ProvisionedThroughput;
//import org.junit.Before;
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ActiveProfiles;
//import org.springframework.test.context.TestPropertySource;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.web.WebAppConfiguration;
//import static org.hamcrest.CoreMatchers.equalTo;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.Matchers.greaterThan;
//import static org.junit.Assert.assertThat;
//import java.util.List;
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = SubfinderApplicationTests.class)
//@WebAppConfiguration
//@ActiveProfiles("local")
//@TestPropertySource(properties = {
//        "amazon.dynamodb.endpoint=http://localhost:8000/",
//        "amazon.aws.accesskey=fakeMyKeyId",
//        "amazon.aws.secretkey=fakeSecretAccessKey" })
//public class SubfinderApplicationTests {
//
//
//    @Autowired
//    private DynamoDBMapper dynamoDBMapper;
//
//    @Autowired
//    private AmazonDynamoDB amazonDynamoDB;
//
//
//    @Autowired
//    private UserTableRepository userTableRepository;
//
//
//    @Before
//    public void setup() throws Exception {
//        dynamoDBMapper = new DynamoDBMapper(amazonDynamoDB);
//
//        CreateTableRequest tableRequest = dynamoDBMapper
//                .generateCreateTableRequest(UserTable.class);
//        tableRequest.setProvisionedThroughput(
//                new ProvisionedThroughput(1L, 1L));
//        amazonDynamoDB.createTable(tableRequest);
//
//        UserTable userTable = new UserTable();
//        userTable.setFirstName("John");
//        // Set other attributes as needed
//        userTableRepository.save(userTable);
//    }
//
//    @Test
//    public void givenItemWithExpectedCost_whenRunFindAll_thenItemIsFound() {
//        UserTable userTable = new UserTable();
//        userTable.setFirstName("Alice");
//        // Set other attributes as needed
//        userTableRepository.save(userTable);
//
//        List<UserTable> result = (List<UserTable>) userTableRepository.findAll();
//
//        assertThat(result.size(), is(greaterThan(0)));
//        assertThat(result.get(0).getFirstName(), is(equalTo("Alice")));
//    }
//}
