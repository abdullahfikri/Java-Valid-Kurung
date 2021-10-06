public class StackKurung {
    public String[] word;
    public int top = 0;
    Boolean quo = true;
    public StackKurung (int n ){
        word = new String[n];
    }

    public boolean isEmpty(){
        return  top == 0;
    }

    public boolean isFull() {
        return  top == word.length;
    }

    public void push (String value) {
        if (!isFull()){
            word[top] = value;
            top++;
        }

    }

    public  String pop() {
        if(top > 0) {
            top--;
            String r = word[top];
            word[top] = null;
            return r;
        }else {
            quo = false;
            return null;
        }
    }

}
