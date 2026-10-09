class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String s : emails){
            String [] email = s.split("@");
            String localName = email[0];
            set.add(""+chuanHoaChuoi(localName)+email[1]);
        }
        return set.size();
    }
    String chuanHoaChuoi(String localName){
        String loaiBoKiTuCham = localName.replace(".", ""); 
        String result; 
        return result = loaiBoKiTuCham.replaceAll("\\+.*", ""); 

    }
}