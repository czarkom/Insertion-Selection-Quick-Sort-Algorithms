import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> stack = new ArrayList<>();

    public T pop(){
       if(stack.size() > 0) return stack.remove(stack.size() - 1);
       else throw new IllegalArgumentException("Stack is already empty");
    }

    public void push(T item){
        stack.add(item);
    }

    public boolean isStackEmpty(){
        return stack.size() == 0;
    }
}
