class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String>set=new HashSet<>();
        for(String email:emails){
            int atpos=email.indexOf("@");
            String localName=email.substring(0,atpos);
            String domainName=email.substring(atpos);
            localName=localName.replaceAll("\\.","");
            if(localName.contains("+")){
                int atplus=localName.indexOf("+");
                localName=localName.substring(0,atplus);
            }

            String newEmail=localName+domainName;
            set.add(newEmail);

        }
        return set.size();
        
    }
}