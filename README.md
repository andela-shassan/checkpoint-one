# checkpoint-one
Reader’s Club 
This is a basic application for a reader's club. Members of the club are of two Categories: Staff and Student. Whenever a member want to borrow a book, they are placed on a queue for that book. This app arrange the queue(or organize the borrowing process) in such a way that Staff are given higher priority over Students. Also, older Staff or Student has higher priority over new Staff or Student. 

Member Class 

This is basically the class that contain all the members of the club. It set the basic properties that are common to all the members of the club. It also serves as the parent class to Staff and Students classes. Also it has methods that allow members to borrow and return book. 

Book Class

This class as the name suggest contains the books that are available for club members to borrow. It sets the properties of each book and keep the record of book that are currently available. 

Staff Class 

This class is a subclass of the member class. I contains only members that are staff. It inherited all the attributes of the member class and also has some other attributes (such as staff-number and netpay) that are peculiar to this class only. Members of this class has higher precedence over members from other class when borrowing book. 

Student Class 

This class is also a subclass of the member class. It can perform any action performed by member of the Member Class, because it inherited all the properties of its parent class. Also, it has some properties(student-number and class) that are peculiar to the member of this class only. When borrowing book, members of this class are considered only after the members of the Staff Class. 

BorrowOrder Class 

This is basically the class that arrange the borrowing order. Whenever more than one member request for a particular book at the same time, this class determines who get the book first. It arranges the borrowers queue making use of the CompareMember Class in such a way that Staff are considered before Student and older Staff or Student are considered before newer members. 

CheckMemberStatus Class 

This class implements comparator used by the BorrowOrder Class to arrange the order in which members borrow book. It compare any member trying to borrow a particular book with those already on the queue for that book and place them on the queue based on their status and rank. 

Test Classes 

These classes are the Junit Test Case classes that confirms the functionality of this application. Note that I choose not to test the basic setters and getters as they performs basic function and rarely fails. 
