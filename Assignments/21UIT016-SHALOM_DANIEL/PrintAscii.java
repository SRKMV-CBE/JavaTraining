class PrintAscii {

    public static void main(String[] args){
    char lowercase = 'a';
    int Ascii;

    System.out.println("ASCII Values of lowercase:\n");

    while (lowercase <= 'z') {
        Ascii = (int) lowercase;
        System.out.println(lowercase +" : "+ Ascii + "\n");
        lowercase++;
    	}
    }
}
