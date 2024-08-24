# I have created this project by using mysql database, I have included all the required dependencies for this. Please create a mysql database named supplierdb or change the configuration in applications.properties in the application.

# I have also added a sql file in the repository please check and import it in your database and i have also implemented validations and everything mentioned in the assignment like pagination etc.

# After running the application hit the url POST: "http://localhost:9000/api/supplier/query" in your Postman or Any other API Tester Application with the json data or query like 

{
    "location": "New York",
    "natureOfBusiness": "SMALL_SCALE",
    "manufacturingProcesses": ["MOULDING"],
    "page": 0,
    "size": 10
}

# The response will be given in the content section of the recieved response json object.
