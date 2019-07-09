public class SanitizeHtml {
    public static String convert(String str) {
        if (str != null) {
            str = str.replaceAll("<", "&lt;");
            str = str.replaceAll(">", "&gt;");
            str = str.replaceAll("&", "&amp;");
            str = str.replaceAll("\\", "&quot;");
            str = str.replaceAll("\'", "&#39;");
        }
        return str;
    }
}