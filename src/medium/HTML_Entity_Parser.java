package medium;

/**
 * @author sucre
 * @date 2020-04-13
 * @time 18:29
 * @description https://leetcode-cn.com/problems/html-entity-parser/
 */
public class HTML_Entity_Parser {
    public String entityParser(String text) {
        text = text.replaceAll("&quot;", "\"");
        text = text.replaceAll("&apos;", "'");
        text = text.replaceAll("&amp;", "&");
        text = text.replaceAll("&gt;", ">");
        text = text.replaceAll("&lt;", "<");
        text = text.replaceAll("&frasl;", "/");
        return text;
    }
}
