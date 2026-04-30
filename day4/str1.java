class str1{
    public static void main(String[] args) {
        String a = "";
        String ra = new String("rakka aa");
        System.out.println(ra);
        System.out.println(ra.length());
        System.out.println(a.isEmpty());
        System.out.println(ra.isBlank());

        //comparison
        System.out.println(ra.equals("rakka aa"));
        System.out.println(ra.equalsIgnoreCase("rakka aa"));
        System.out.println(ra.compareTo(a));
        System.out.println(ra.contains(" "));

        //Extraction
        System.out.println(ra.charAt(6));
        System.out.println(ra.substring(0, 5));
        System.out.println(ra.indexOf("k"));
        System.out.println(ra.lastIndexOf("v"));

    }
}