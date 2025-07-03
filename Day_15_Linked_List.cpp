#include <iostream>
#include <cstddef>
using namespace std;	
class Node
{
    public:
        int data;
        Node *next;
        Node(int d){
            data=d;
            next=NULL;
        }
};
class Solution{
    public:

    Node* insert(Node *head, int data)
{
    Node* newNode = new Node(data); // Step 1: Create a new node

    // Step 2: If the list is empty, return the new node as head
    if (head == NULL) {
        return newNode;
    }

    // Step 3: Otherwise, find the last node
    Node* current = head;
    while (current->next != NULL) {
        current = current->next;
    }

    // Step 4: Link the new node at the end
    current->next = newNode;

    // Step 5: Return the unchanged head
    return head;
}


      void display(Node *head)
      {
          Node *start=head;
          while(start)
          {
              cout<<start->data<<" ";
              start=start->next;
          }
      }
};
int main()
{
	Node* head=NULL;
  	Solution mylist;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        head=mylist.insert(head,data);
    }	
	mylist.display(head);
		
}