#include <iostream>

using namespace std;

// Danh Sach Thuan Tuy
typedef struct node {
    int info;
    struct node *next;

} Node;




int main() {
    Node* head ;

//    Ke THua Cau Truc Node
    Node* one = NULL;
    Node* two = NULL;
    Node* three = NULL;

    //Khoi Tao Node
    one = new Node();
    two = new Node();
    three = new Node ();

    one->info = 1;
    two->info = 2;
    three->info = 3;

    one->next = two;
    two->next = three;
    three->next = NULL;

    head = one;
    while (head != NULL) {
        cout << head->info;
        head = head->next;
    }
}
