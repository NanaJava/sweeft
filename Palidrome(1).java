

boolean isPalindrome(String text) {
	s= s.toLowerCase();
    s = s.replaceAll("[^a-z0-9]", "");
    for(int i = 0; i <s.length()/2; i++) {
        if(s.charAt(i) != s.charAt(s.length()-1-i)) {
            return false;
        }
    }   
    
    return true;
}
