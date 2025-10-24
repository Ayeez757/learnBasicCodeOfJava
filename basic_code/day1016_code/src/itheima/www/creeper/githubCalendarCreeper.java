package itheima.www.creeper;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class githubCalendarCreeper {
    public static void main(String[] args) {
        try {
            // 创建URL对象
            URL url = new URL("https://github.com/ayeez757");

            // 打开连接并创建输入流
            BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;
            StringBuilder content = new StringBuilder();

            // 逐行读取网页内容并保存到StringBuilder中
            while ((line = reader.readLine()) != null) {
                content.append(line);
            }

            // 关闭输入流
            reader.close();

//            // 打印网页内容
//            System.out.println(content.toString());

            //正则表达式
            String regex = "data-date=\"\\d{4}[-]\\d{2}[-]\\d{2}";

            //获取正则表达式的对象
            Pattern p = Pattern.compile(regex);

            //获取文本匹配的对象
            Matcher m = p.matcher(content.toString());
            while(m.find()){
                String s = m.group();
                System.out.println(s);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
//
//<td tabindex="-1" data-ix="41" aria-selected="false" aria-describedby="contribution-graph-legend-level-2"
//style="width: 10px" data-date="2025-10-13" id="contribution-day-component-1-41"
//data-level="2" role="gridcell" data-view-component="true" class="ContributionCalendar-day"
//aria-labelledby="tooltip-d7b4a324-ce7b-4d87-add0-e4f5bb1d52aa"></td>