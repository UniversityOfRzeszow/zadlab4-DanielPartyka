package pl.edu.ur.polab4;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Studenci1 s1 = new Studenci1("","",0,"",0);
        Studenci1 s2 = new Studenci1("","",0,""); 
        Studenci1 s3 = new Studenci1("","",0); 
        Studenci1 s4 = new Studenci1("",""); 
        s1.pokaz();
        s2.pokaz();
        s3.pokaz();
        s4.pokaz();
        Studenci ss = new Studenci("glddgf","gkjdfgkjfd",0,"kgfdgf",0);
        ss.wczytaj();
        ss.pokaz();
    }
    
}
