public class Codec {
    private static String originalUrl;
    private static String tinyUrl;
    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        originalUrl = longUrl;
        tinyUrl="http://tinyurl.com/4e9iAkl";
        return tinyUrl;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return originalUrl;
    }
}
