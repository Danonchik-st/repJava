

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

public class NetworkService {

    public static String getStringFromURL(String spec, String code) throws IOException, URISyntaxException {
        URI uri = new URI(spec);
        URL url = uri.toURL();
        URLConnection connection = url.openConnection();
        StringBuilder sb = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream(), code))) {
            for (;;) {
                String textLine = br.readLine();
                if (textLine == null) {
                    break;
                }
                sb.append(textLine).append(System.lineSeparator());
            }
            return sb.toString();
        }
    }

    public static long getFileFromURL(String spec, File folder) throws IOException, URISyntaxException {
        URI uri = new URI(spec);
        URL url = uri.toURL();
        URLConnection connection = url.openConnection();
        int n = spec.lastIndexOf("/");
        String fileName = spec.substring(n + 1);
        File file = new File(folder, fileName);
        try (InputStream is = connection.getInputStream();
             OutputStream os = new FileOutputStream(file)) {
            return is.transferTo(os);
        }

    }

    public static Map<String, List<String>> getHeaders(String spec) throws IOException, URISyntaxException {
        URI uri = new URI(spec);
        URL url = uri.toURL();
        URLConnection connection = url.openConnection();
        return connection.getHeaderFields();
    }

}