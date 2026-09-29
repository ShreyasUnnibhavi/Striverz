package OOP;

interface ClickListener {
    void onClick();
}

class Button {
    private String label;
    private ClickListener listener;

    public Button(String label) {
        this.label = label;
    }

    public void setClickListener(ClickListener listener) {
        this.listener = listener;
    }

    public void click() {
        System.out.println("Clicking button '" + label + "'");
        if(listener != null) {
            listener.onClick();
        }
    }
}

public class AnonymousClass {
    public static void main(String[] args) {
        Button submiButton = new Button("Submit");
        submiButton.setClickListener(new ClickListener() {
            @Override 
            public void onClick() {
                System.out.println("Submit button clicked");
            }
        });
        submiButton.click();
    }
}
