__Created a Table Employee_details and inserted data --> Performed these actions in SQL developer.__

| Column Name       | Field Type   |
| ----------------- | ------------ |
| UserID            | Varchar(200) |
| Password          | Varchar(200) |
| Name              | Varchar(200) |
| IncorrectAttempts | Number(2)    |
| LockStatus        | Number(2)    |
| UserType          | Varchar(200) |


__Records inserted__
 
    1. (AB1001, AB1001, Hari, 0, 0, Admin) 
    
    2. (TA1002, TA1002, Prasath, 0, 0, Employee) 
    
    3. (RS1003, RS1003, Ganesh, 0, 0, Employee)  

__This Repository performs given operations on Employee_details table:__

__Scenario 1:-__

__Create a method String getUserType(String userID).__

This method should do the following operation.

     a) Obtain the Connection Object by calling the getConnection() method.
     
     b) Using the Connection Object, retrieve the userType and return it.
     
     c) Create a main method and call the getUserType method and print the value obtained.

__Scenario 2:-__

__Create a method String getIncorrectAttempts(String userID).__

This method should do the following operation.

    a) Obtain the Connection Object by calling the getConnection() method.
    
    b) Using the Connection Object, retrieve the IncorrectAttempts.
    
    If the incorrect attempt is 0, return "No Incorrect Attempt".
    
    If the incorrect attempt is 1, return "One Time".
    
    Else, return "Incorrect Attempt Exceeded".
    
    c) Create a main method and call the getIncorrectAttempts method and print the value obtained.

__Scenario 3:-__

__Create a method String changeUserType(String userID).__

This method should do the following operation.

    a) Obtain the Connection Object by calling the getConnection() method.
    
    b) Using the Connection Object, update the user type of the given userID to Admin.
    
    If more than one row is updated, return "Update Success".
    
    Else, return "Update Failed".
    
    c) Create a main method and call the changeUserType method and print the value obtained.

__Scenario 4:-__

__Create a method int getLockStatus().__

This method should do the following operation.

    a) Obtain the Connection Object by calling the getConnection() method.
    
    b) Using the Connection Object, count the total rows with the lock status 0.
    
    c) Create a main method and call the getLockStatus method and print the value obtained.

__Scenario 5:-__

__Create a method String changeName(String id, String name).__

This method should do the following
operation.

    a) Obtain the Connection Object by calling the getConnection() method.
    
    b) Using the Connection Object, change the name for the given ID. On successful change return "Success", on-fail return "Failed".
    
    c) Create a main method and call the changeName method and print the value obtained.
    
    d) Go to SQL plus and check the correctness of change.

__Scenario 6:-__

__Create a method String changePassword(String password).__

This method should do the following
operation.

    a) Obtain the Connection Object by calling the getConnection() method.
    
    b) Using the Connection Object, change the password to the parameterized password value for all the records with userType "Admin". On success, return "Changed", On Failure return 0.
    
    c) Create a main method and call the changePassword method and print the value obtained.
    
    d) Go to SQL plus and check the correctness of change.

__Scenario 7:-__

__Create a method String addUser_1(UserBean bean).__

This method should do the following operation.

    a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock Status, User Type) and initialize getters and setters.
    
    b) Obtain the Connection Object by calling the getConnection() method.
    
    c) Using the Connection Object, insert a new record to the table. (Use the parameter of the method to get the values to insert). On successful insert, return "Success", on-fail return "Fail".
    
    d) Create a main method and set values for the private variables of UserBean, call the addUser_1 method and print the value obtained.
    
    e) Go to SQL plus and check the correctness of change.

__Scenario 8:-__

__Create a method String addUser_2(UserBean bean).__

This method should do the following operation.

    a) Create UserBean with the following private variables: ID, Password, Name, IncorrectAttempts, LockStatus, UserType, and initialize getters and setters.
    
    b) Obtain the Connection Object by calling the getConnection() method.
    
    c) Using the Connection Object, insert a new record into the table if and only if the LockStatus is 0.
    
    Use the method parameter to get the values to insert.
    
    On successful insert, return "Success".
    
    On failure, return "Fail".
    
    d) Create a main method, set values for the private variables of UserBean, call the addUser_2 method, and print the value obtained.
    
    e) Go to SQL Plus and check the correctness of the change.

__Scenario 9:-__

__Create a method ArrayList<UserBean> getUsers(String userType).__

This method should do the following operation.

     a) Create UserBean with the following private variables: ID, Password, Name, IncorrectAttempts, LockStatus, UserType, and initialize getters and setters.
     
     b) Obtain the Connection Object by calling the getConnection() method.
     
     c) Using the Connection Object, retrieve the records of the specified userType and store them into an ArrayList, then return it.
     
     Use the method parameter to extract the user records of the specified user type.
     
     d) Create a main method, call the getUsers method, and print the values obtained.
  
__Scenario 10:-__

__Create a method ArrayList<UserBean> storeAllRecords().__

This method should do the following operation.

    a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock Status, User Type) and initialize getters and setters.
    
    b) Obtain the Connection Object by calling the getConnection() method.
    
    c) Using the Connection Object, retrieve all the records and store it into array list.
    
    d) Create a main method call the storeAllRecords method and print the values obtained.

__Scenario 11:-__

__Create a method String[] getNames().__

This method should do the following operation.

    a) Create User Bean with following private variables (ID, Password, Name, Incorrect Attempts, Lock Status, User Type) and initialize getters and setters.
    
    b) Obtain the Connection Object by calling the getConnection() method.
    
    c) Using the Connection Object, retrieve all names from the table and store it into string array.
    
    d) Create a main method call the getNames method and print the values obtained.
