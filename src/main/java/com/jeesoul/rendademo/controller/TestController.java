package com.jeesoul.rendademo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;

/**
 * @author：dxy
 * @date : 2020-02-20
 */
@Controller
@RequestMapping("/demo")
public class TestController {

    @RequestMapping("index")
    public String demo(HttpServletResponse response){
        response.setHeader("Cookies",
        "Cookie: studyPdongxueyongBK143A=2020%2D2%2D20+18%3A23%3A12; studyMdongxueyongBK143A=03bb9a02678fc06cf58bfdc7f576b441; recordtimebk143a1=2020%2D2%2D20+19%3A16%3A16; studyMdongxueyongBK141A=1d5a1e5fbaf711bac32f6ac472c7458e; studyPdongxueyongBK141A=2020%2D2%2D20+22%3A27%3A04; Hm_lvt_e54f513b7a63c542d59de9a575d678d5=1582193829; Hm_lvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582193830; ASPSESSIONIDCQSRCQQS=FFPFFJHCDCJDALGOAJFIJADA; userid=dongxueyong; cmr%5Fp%5Fuid=dongxueyong; cmr%5Fpleusername=dongxueyong=%B6%AD%D1%A7%D3%C2; buyerNumStat=null; yugu=null; ASPSESSIONIDCSRQDSQT=HGNBGMBDGLEDIGOGFLIJPGED; studydate=lw=01%2E20%7E02%2E28&zy=%A3%A8%BF%CE%B3%CC%D7%F7%D2%B52020%2E3%2E13%BD%D8%D6%B9%A3%A9&ks=03%2E14%7E03%2E15&xk=12%2E30%7E12%2E31; ASPSESSIONIDASTQDTRT=BOGKPMBDBKFEGBKENLDLMMFI; ASP.NET_SessionId=4nxmhk550xay3gvkteauf0y5; username=wqi%5FBK134A%3BBK141A%3BBK142A%3BBK143A%3BBK146A%3BBK147A=%BF%CE%B3%CC%B8%A8%B5%BC%C0%CF%CA%A6&yxia%5FBK140A%3BBK151A%3BZK103B%3BZK132A=%BF%CE%B3%CC%B8%A8%B5%BC%C0%CF%CA%A6&yxia%5FBK135A%3BBK136A%3BBK139A%3BBK140A%3BBK151A%3BZK103B%3BZK124A%3BZK129A%3BZK130A%3BZK132A%3BZK133A%3BZK134A=%BF%CE%B3%CC%B8%A8%B5%BC%C0%CF%CA%A6&wqi%5FBK143A=%D2%C6%B6%AF%C6%BD%CC%A8%D3%A6%D3%C3%BF%AA%B7%A2%B8%A8%B5%BC%C0%CF%CA%A6&yxia%5FZK103B=%BC%C6%CB%E3%BB%FA%D3%A6%D3%C3%BB%F9%B4%A1%A3%A8%B5%DA%B6%FE%B0%E6%A3%A9%B8%A8%B5%BC%C0%CF%CA%A6; Hm_lpvt_e54f513b7a63c542d59de9a575d678d5=1582201794; Hm_lpvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582201794; Hm_lvt_63c81042df1689f7de2fdd676b8d0301=1582193849,1582201791,1582201801; ASPSESSIONIDASRRASRT=LGIPCGEDGKDLHMBPMMMEGDLO; CMRU=b7ebOU687lDP%2Fw1OB8yMZ0WFslwvJVsWQBjivqOeu6346LlbwkChilr5gnCtGAQ; auth%5Fuser=cf7215qW0Lek4%2BFOuxUVE3a32lZ%2BxZXkadoemq2x3RUDDJ4fpPqkjwTThQ; cmr%5FAuthCookie=deptid=1&pid=cmr&approval%5Fdeptid=1&user%5Fid=dongxueyong&sign=399a3987cdd164ba347c60095256eecd&agencyid=34001&t%5Ftime=2020%2D2%2D20%4022%3A16%3A38&u%5Fp=f; cmr%5Fuid=u%5Fp=f&deptId=1&uid=dongxueyong&approval%5FdeptId=1&c%5Ftime=2020%2F2%2F20%4022%3A16%3A38&sn=918004b43f874c25fe35415e577694d7&pid=cmr&agencyId=34001&u%5Fip=36%2E62%2E232%2E96; thePath=dongxueyong=%2Fapplication%2Fimages%2Fmen%2Epng; ple%5Fstu%5Finfo%5Fuh=t=319889799&u=dongxueyong; rmdCount=4; msgCount=0; welcome=%20%0D%0A%20%3C%21--%20%3Cspan%20class%3D%22slide%22%3E%u6536%u8D77%3C/span%3E--%3E%0D%0A%20%3Cdiv%20class%3D%22welcome%22%20id%3D%22welcome%22%3E%0D%0A%20%20%3Cdiv%20class%3D%22wel_title%22%3E%20%u8463%u5B66%u52C7%uFF0C%u665A%u4E0A%u597D%uFF0C%u5168%u5FC3%u6295%u5165%uFF0C%u6536%u83B7%u4E0D%u5C0F%uFF01%20%3Cspan%3E%3C/span%3E%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22last_time%22%3E%u4ECA%u5929%u662F%uFF1A2020%u5E742%u670820%u65E5%20%u661F%u671F%u56DB%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22message%22%3E%3Ca%20id%3D%22indexremind%22%20href%3D%22/messageAdmin/remindlist.asp%22%3E%u63D0%u9192%280%29%3C/a%3E%26nbsp%3B%7C%26nbsp%3B%3Ca%20id%3D%22indexmessage%22%20href%3D%22/messageAdmin/resievemessage.asp%22%3E%u6D88%u606F%280%29%3C/a%3E%7C%3Ca%20href%3D%22http%3A//mail.cmr.com.cn/mailinfc/%22%20target%3D%22_blank%22%3E%u90AE%u7BB1%3C/a%3E%3C/div%3E%0D%0A%20%3C/div%3E%0D%0A%0D%0A%0D%0A; fCompleteRate=20%25; iOughtCurrCredit=16; fObtainRate=56%25; iOughtTotCredit=80; iObtainCredit=45; Hm_lpvt_63c81042df1689f7de2fdd676b8d0301=1582208258; stuInfo=c2NyaXB0VGltZT0yMDIwLTItMjBAMjI6Mjc6MDQmdXNlcmlkPWRvbmd4dWV5b25nJmNvdXJzZWlkPUJLMTQxQSZ0YWc9QjNFOEFGNTY1MjIxREUzQzU1QTcxMkQ0MzdBRTI4NUQ=; S_T=MjAyMC0yLTIwIDIzOjIzOjIzLjQyMA%3D%3D; E_T=MjAyMC0yLTIwIDIzOjIzOjMwLjc5Mw%3D%3D\n");
        response.setHeader("User-Agent","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36\n");
        return "index";

    }

}
