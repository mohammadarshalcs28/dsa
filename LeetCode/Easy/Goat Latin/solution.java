class Solution {
    public String toGoatLatin(String sentence) {
        String[] words=sentence.split(" ");
        String result ="";
        for(int i = 0;i<words.length;i++){
            String word = words[i];
            char firstchar = word.charAt(0);
            String transformedword="";
            if(firstchar=='a'||firstchar=='e'||firstchar=='i'||firstchar=='o'||firstchar=='u'||firstchar=='A'||firstchar=='E'||firstchar=='I'||firstchar=='O'||firstchar=='U'){
            transformedword = word + "ma";
            }
            else{
                transformedword = word.substring(1)+firstchar+"ma";
            }
            for(int j=0;j<=i;j++){
                transformedword +='a';
            }
            result += transformedword + " ";
        }
        return result.trim();
    }
}