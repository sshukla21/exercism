class RnaTranscription {

    String transcribe(String dnaStrand) {
        String rnaStrand = "";
        for(int i = 0; i<dnaStrand.length(); i++){
            rnaStrand = rnaStrand+replace(dnaStrand.charAt(i));
        }
        return rnaStrand;
    }

    char replace(char nucleotide){
        switch(nucleotide){
            case 'G' :
                return 'C';
            case 'C' :
                return 'G';
            case 'T' :
                return 'A';
            case 'A' :
                return 'U';
            default :
                throw new IllegalArgumentException("Invalid");
        }
        
    }

}
