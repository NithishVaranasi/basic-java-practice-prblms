/*import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class Stack {
    private int[] stack;
    private int top;
    private int capacity;
    public Stack(int capacity) {
        this.capacity = capacity;
        stack = new int[capacity];
        top = -1;
    }
    public void push(int element) {
        if (top == capacity - 1) {
            System.out.println("Stack Overflow: Cannot push element " + element + ". Stack is full.");
        } else {
            stack[++top] = element;
        }
    }
    public int pop() {
        if (top == -1) {
            System.out.println("Stack Underflow: Cannot pop element. Stack is empty.");
            return -1; // Return a default value or throw an exception based on your requirements
        } else {
            return stack[top--];
        }
    }
    public boolean isEmpty() {
        return (top == -1);
    }
    public void printStack() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            for (int i = 0; i <= top; i++) {
                System.out.println(stack[i]);
            }
        }
    }
}
public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // Total number of operations

        Stack stack = new Stack(n);

        for (int i = 0; i < n; i++) {
            String operation = scanner.next();

            if (operation.equals("Push")) {
                int element = scanner.nextInt();
                stack.push(element);
            } else if (operation.equals("Pop")) {
                stack.pop();
            } else if (operation.equals("Print")) {
                stack.printStack();
            }
        }
        
    }
}*/


