package com.company;

public class LeetCodeQuestionsOnLinkedListRunner {
    public static void main(String[] args) {
        LeetCodeQuestionsOnLinkedList list = new LeetCodeQuestionsOnLinkedList();

//        list.insert(3);
//        list.insert(3);
        list.insert(2);
        list.insert(1);
        list.insert(1);

        list.display();

        list.deleteDuplicates(list.head);

        list.display();
    }
}
