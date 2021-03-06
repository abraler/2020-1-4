import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.HtmlElement;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class httpPUnitdemo {
    public static void main(String[] args)throws IOException {
        WebClient webClient=new WebClient(BrowserVersion.CHROME);
        webClient.getOptions().setJavaScriptEnabled(false);
        webClient.getOptions().setCssEnabled(false);
        HtmlPage page=webClient.getPage("http://so.gushiwen.org/gushi/tangshi.aspx");
        System.out.println(page);
        page.save(new File("唐诗三百首\\列表页.html"));

        HtmlElement body=page.getBody();
        List<HtmlElement> elements=body.getElementsByAttribute("div","class","typecont");
        for (HtmlElement element:elements) {
            System.out.println(element);
        }

        HtmlElement divelement=elements.get(0);
    }
}
