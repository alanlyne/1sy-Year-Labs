
class Square {
    public int length;

    public Square(){
        this.length = 1;
    }

    public Square(int l){
        this.length = 1;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int l){
        this.length = 1;
    }

    public int getArea(){
        return this.length * this.length;
    }

    public String toString(){
        return "LENGTH: " + this.length;
    }
}