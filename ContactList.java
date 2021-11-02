
/**
 * Contact List class for linked list implementation.
 * Node class and displayList method are already given for you. You need to implement rest of the methods.
 *
 * addToEnd(Contact new_contact): Add a new contact to the end of linked list.
 * Notice that if the list is empty, this new contact will be your first contact.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 *
 * insertAfter(Contact prev_contact, Contact new_contact) :  Add a new contact after a given previous contact.
 * If there is no such previous contact, do not do anything.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 *
 * insertBefore(Contact next_contact, Contact new_contact) : Add a new contact before a given 'next contact' .
 * If there is no such next contact, do not do anything.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 * If new_contact is null, throw a NullPointerException with the message 'Null contact entry denied!'.
 *
 * delete(Contact del_contact): Delete a given contact from the ContactList.
 * If there is no such contact, do not do anything.
 *
 * addToFav(Contact contact_to_fav): Change position of the given contact to the very beginning of the linked list.
 * If the given contact is already in favourites do not change its position.
 * Change the fav boolean of the contact to true.
 * Do not add a new contact to list with this method.
 *
 * removeFromFav(Contact contact_to_fav): Change position of the given contact to the very end of the linked list.
 * If the given contact is already not in favourites do not change its position.
 * Change the fav boolean of the contact to false.
 * Do not add a new contact to list with this method.
 *
 * displayList(): DO NOT change this method. It is important to have same output format.
 *
 * You are free to add some helper methods in the ContactList class (e.g. search, addToBeginning).
 * But you can also implement this class without any helper methods.
 */

class ContactList
{
    Node head;

    class Node
    {
        Contact data;
        Node next;
        Node(Contact d)
        {
            data = d;
            next = null;
        }
    }

    public void addToEnd(Contact new_contact) {
        // Your code here
    }

    public void insertAfter(Contact prev_contact, Contact new_contact) {
        // Your code here
    }

    public void insertBefore(Contact next_contact, Contact new_contact) {
        // Your code here
    }

    public void delete(Contact del_contact) {
        // Your code here
    }

    public void addToFav(Contact contact_to_fav){
        // Your code here
    }

    public void removeFromFav(Contact contact_to_fav){
        // Your code here
    }

    public void displayList() {
        Node temp = head;
        while (temp != null)
        {
            temp.data.displayInfo();
            temp = temp.next;
        }
    }

}