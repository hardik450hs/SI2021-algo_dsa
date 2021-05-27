package strings;

public class Anagram {
    public static void main(String[] args) {
        String a = "aat";
        String b = "ata";
        
    
        // track : 1 O(n^2)
        // boolean anagram = false;
        // boolean visited[]=new boolean[b.length()];
        // if(a.length()== b.length()){
        //     for(int i=0;i<a.length();i++){
        //         char c=a.charAt(i);
        //         anagram=false;
        //         for(int j=0;j<b.length();j++){
        //             if(b.charAt(j)==c && !visited[j]){
        //                 anagram=true;
        //                 visited[j]=true;
        //                 break;
        //             }
        //         }
        //         if(!anagram)
        //             break;
        //     }
        // }


        //track 2: sort both strings and compare. O(n log n)


        //track 3: O(n)
        // boolean anagram=true;
        // int al[]=new int[256];
        // int bl[]=new int[256];

        // for(char c:a.toCharArray()){
        //     int index = (int) c;
        //     al[index]++;
        // }

        
        // for(char c:b.toCharArray()){
        //     int index = (int) c;
        //     bl[index]++;
        // }

        // for(int i=0;i<256;i++){
        //     if(al[i]!=bl[i]){
        //         anagram=false;
        //         break;
        //     }
        // }

        //track 4:

        boolean anagram=true;

        int al[]=new int[256];
        

        for(char c:a.toCharArray()){
            int index = (int) c;
            al[index]++;
        }
        for(char c:b.toCharArray()){
            int index = (int) c;
            al[index]--;
        }

        for(int i=0;i<256;i++){
            if(al[i]!=0){
                anagram=false;
                break;
            }
        }

        if(anagram==true){
            System.out.println("is Anagram");
        }
        else
            System.out.println("is not Anagram");
       
    }
}
