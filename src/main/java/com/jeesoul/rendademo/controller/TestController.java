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


    @RequestMapping("login")
    public String login(HttpServletResponse response) {
//        response.setHeader("Cookies",
//                "userid=dongxueyong; buyerNumStat=null; yugu=null; Hm_lvt_e54f513b7a63c542d59de9a575d678d5=1582193829,1582255433; Hm_lpvt_e54f513b7a63c542d59de9a575d678d5=1582255433; Hm_lvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582193830,1582255433; Hm_lpvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582255433; ASPSESSIONIDQSSQCRSQ=NEOKHCADCAPJIAIHJBOCBLIA; auth%5Fuser=0a8cYMHykAdG6U4UfFSq7OnhYGq8GHaLS%2BIQYPe%2FB2qromUDnAgATOFpYw; CMRU=bb3fPhOLoLVwJi0TOsxhI9KI4Z7WcIffimqjmt2Y9IZ9MPFGX2eOUXY6bpABMoI; cmr%5FAuthCookie=t%5Ftime=2020%2D2%2D21%4011%3A24%3A58&u%5Fp=f&deptid=1&sign=dfbcd55d2858de04e940807eedd725fa&agencyid=34001&pid=cmr&approval%5Fdeptid=1&user%5Fid=dongxueyong; cmr%5Fuid=agencyId=34001&u%5Fip=36%2E62%2E232%2E155&sn=53ddf16e6ce29de48d88adcc84839cd9&pid=cmr&u%5Fp=f&approval%5FdeptId=1&c%5Ftime=2020%2F2%2F21%4011%3A24%3A58&deptId=1&uid=dongxueyong; cmr%5Fp%5Fuid=dongxueyong; thePath=dongxueyong=%2Fapplication%2Fimages%2Fmen%2Epng; ple%5Fstu%5Finfo%5Fuh=t=319937098&u=dongxueyong; cmr%5Fpleusername=dongxueyong=%B6%AD%D1%A7%D3%C2; ASPSESSIONIDSQRRDRTQ=NKFBICADIOLFHGPMDKBBLLHI; rmdCount=4; msgCount=0; Hm_lvt_63c81042df1689f7de2fdd676b8d0301=1582193849,1582201791,1582201801,1582255462; fCompleteRate=20%25; iOughtCurrCredit=16; fObtainRate=56%25; iOughtTotCredit=80; iObtainCredit=45; studydate=lw=01%2E20%7E02%2E28&zy=%A3%A8%BF%CE%B3%CC%D7%F7%D2%B52020%2E3%2E13%BD%D8%D6%B9%A3%A9&ks=03%2E14%7E03%2E15&xk=12%2E30%7E12%2E31; welcome=%20%0D%0A%20%3C%21--%20%3Cspan%20class%3D%22slide%22%3E%u6536%u8D77%3C/span%3E--%3E%0D%0A%20%3Cdiv%20class%3D%22welcome%22%20id%3D%22welcome%22%3E%0D%0A%20%20%3Cdiv%20class%3D%22wel_title%22%3E%20%u8463%u5B66%u52C7%uFF0C%u4E0A%u5348%u597D%uFF0C%u65F6%u95F4%u5B9D%u8D35%uFF0C%u503C%u5F97%u7528%u5FC3%uFF01%20%3Cspan%3E%3C/span%3E%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22last_time%22%3E%u4ECA%u5929%u662F%uFF1A2020%u5E742%u670821%u65E5%20%u661F%u671F%u4E94%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22message%22%3E%3Ca%20id%3D%22indexremind%22%20href%3D%22/messageAdmin/remindlist.asp%22%3E%u63D0%u9192%280%29%3C/a%3E%26nbsp%3B%7C%26nbsp%3B%3Ca%20id%3D%22indexmessage%22%20href%3D%22/messageAdmin/resievemessage.asp%22%3E%u6D88%u606F%280%29%3C/a%3E%7C%3Ca%20href%3D%22http%3A//mail.cmr.com.cn/mailinfc/%22%20target%3D%22_blank%22%3E%u90AE%u7BB1%3C/a%3E%3C/div%3E%0D%0A%20%3C/div%3E%0D%0A%0D%0A%0D%0A; ASPSESSIONIDSQTRATSR=MLGIHCADAGCCCJCADIOJLLON; Hm_lpvt_63c81042df1689f7de2fdd676b8d0301=1582255486; S_T=MjAyMC0yLTIxIDExOjI1OjAuNjM2; E_T=MjAyMC0yLTIxIDExOjI1OjMwLjcyMA%3D%3D\n");
//        response.setHeader("User-Agent",
//                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36\n");
        return "login";

    }

    @RequestMapping("index")
    public String demo(HttpServletResponse response) {
//        response.setHeader("Cookies",
//                "userid=dongxueyong; buyerNumStat=null; yugu=null; Hm_lvt_e54f513b7a63c542d59de9a575d678d5=1582193829,1582255433; Hm_lpvt_e54f513b7a63c542d59de9a575d678d5=1582255433; Hm_lvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582193830,1582255433; Hm_lpvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582255433; ASPSESSIONIDQSSQCRSQ=NEOKHCADCAPJIAIHJBOCBLIA; auth%5Fuser=0a8cYMHykAdG6U4UfFSq7OnhYGq8GHaLS%2BIQYPe%2FB2qromUDnAgATOFpYw; CMRU=bb3fPhOLoLVwJi0TOsxhI9KI4Z7WcIffimqjmt2Y9IZ9MPFGX2eOUXY6bpABMoI; cmr%5FAuthCookie=t%5Ftime=2020%2D2%2D21%4011%3A24%3A58&u%5Fp=f&deptid=1&sign=dfbcd55d2858de04e940807eedd725fa&agencyid=34001&pid=cmr&approval%5Fdeptid=1&user%5Fid=dongxueyong; cmr%5Fuid=agencyId=34001&u%5Fip=36%2E62%2E232%2E155&sn=53ddf16e6ce29de48d88adcc84839cd9&pid=cmr&u%5Fp=f&approval%5FdeptId=1&c%5Ftime=2020%2F2%2F21%4011%3A24%3A58&deptId=1&uid=dongxueyong; cmr%5Fp%5Fuid=dongxueyong; thePath=dongxueyong=%2Fapplication%2Fimages%2Fmen%2Epng; ple%5Fstu%5Finfo%5Fuh=t=319937098&u=dongxueyong; cmr%5Fpleusername=dongxueyong=%B6%AD%D1%A7%D3%C2; ASPSESSIONIDSQRRDRTQ=NKFBICADIOLFHGPMDKBBLLHI; rmdCount=4; msgCount=0; Hm_lvt_63c81042df1689f7de2fdd676b8d0301=1582193849,1582201791,1582201801,1582255462; fCompleteRate=20%25; iOughtCurrCredit=16; fObtainRate=56%25; iOughtTotCredit=80; iObtainCredit=45; studydate=lw=01%2E20%7E02%2E28&zy=%A3%A8%BF%CE%B3%CC%D7%F7%D2%B52020%2E3%2E13%BD%D8%D6%B9%A3%A9&ks=03%2E14%7E03%2E15&xk=12%2E30%7E12%2E31; welcome=%20%0D%0A%20%3C%21--%20%3Cspan%20class%3D%22slide%22%3E%u6536%u8D77%3C/span%3E--%3E%0D%0A%20%3Cdiv%20class%3D%22welcome%22%20id%3D%22welcome%22%3E%0D%0A%20%20%3Cdiv%20class%3D%22wel_title%22%3E%20%u8463%u5B66%u52C7%uFF0C%u4E0A%u5348%u597D%uFF0C%u65F6%u95F4%u5B9D%u8D35%uFF0C%u503C%u5F97%u7528%u5FC3%uFF01%20%3Cspan%3E%3C/span%3E%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22last_time%22%3E%u4ECA%u5929%u662F%uFF1A2020%u5E742%u670821%u65E5%20%u661F%u671F%u4E94%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22message%22%3E%3Ca%20id%3D%22indexremind%22%20href%3D%22/messageAdmin/remindlist.asp%22%3E%u63D0%u9192%280%29%3C/a%3E%26nbsp%3B%7C%26nbsp%3B%3Ca%20id%3D%22indexmessage%22%20href%3D%22/messageAdmin/resievemessage.asp%22%3E%u6D88%u606F%280%29%3C/a%3E%7C%3Ca%20href%3D%22http%3A//mail.cmr.com.cn/mailinfc/%22%20target%3D%22_blank%22%3E%u90AE%u7BB1%3C/a%3E%3C/div%3E%0D%0A%20%3C/div%3E%0D%0A%0D%0A%0D%0A; ASPSESSIONIDSQTRATSR=MLGIHCADAGCCCJCADIOJLLON; Hm_lpvt_63c81042df1689f7de2fdd676b8d0301=1582255486; S_T=MjAyMC0yLTIxIDExOjI1OjAuNjM2; E_T=MjAyMC0yLTIxIDExOjI1OjMwLjcyMA%3D%3D\n");
//        response.setHeader("User-Agent",
//                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36\n");
        return "index";

    }


    @RequestMapping("android")
    public String android(HttpServletResponse response) {
//        response.setHeader("Cookies",
//                "userid=dongxueyong; buyerNumStat=null; yugu=null; Hm_lvt_e54f513b7a63c542d59de9a575d678d5=1582193829,1582255433; Hm_lpvt_e54f513b7a63c542d59de9a575d678d5=1582255433; Hm_lvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582193830,1582255433; Hm_lpvt_7ef6a3dee3de0ddfba99b33cb7bb7c8f=1582255433; ASPSESSIONIDQSSQCRSQ=NEOKHCADCAPJIAIHJBOCBLIA; auth%5Fuser=0a8cYMHykAdG6U4UfFSq7OnhYGq8GHaLS%2BIQYPe%2FB2qromUDnAgATOFpYw; CMRU=bb3fPhOLoLVwJi0TOsxhI9KI4Z7WcIffimqjmt2Y9IZ9MPFGX2eOUXY6bpABMoI; cmr%5FAuthCookie=t%5Ftime=2020%2D2%2D21%4011%3A24%3A58&u%5Fp=f&deptid=1&sign=dfbcd55d2858de04e940807eedd725fa&agencyid=34001&pid=cmr&approval%5Fdeptid=1&user%5Fid=dongxueyong; cmr%5Fuid=agencyId=34001&u%5Fip=36%2E62%2E232%2E155&sn=53ddf16e6ce29de48d88adcc84839cd9&pid=cmr&u%5Fp=f&approval%5FdeptId=1&c%5Ftime=2020%2F2%2F21%4011%3A24%3A58&deptId=1&uid=dongxueyong; cmr%5Fp%5Fuid=dongxueyong; thePath=dongxueyong=%2Fapplication%2Fimages%2Fmen%2Epng; ple%5Fstu%5Finfo%5Fuh=t=319937098&u=dongxueyong; cmr%5Fpleusername=dongxueyong=%B6%AD%D1%A7%D3%C2; ASPSESSIONIDSQRRDRTQ=NKFBICADIOLFHGPMDKBBLLHI; rmdCount=4; msgCount=0; Hm_lvt_63c81042df1689f7de2fdd676b8d0301=1582193849,1582201791,1582201801,1582255462; fCompleteRate=20%25; iOughtCurrCredit=16; fObtainRate=56%25; iOughtTotCredit=80; iObtainCredit=45; studydate=lw=01%2E20%7E02%2E28&zy=%A3%A8%BF%CE%B3%CC%D7%F7%D2%B52020%2E3%2E13%BD%D8%D6%B9%A3%A9&ks=03%2E14%7E03%2E15&xk=12%2E30%7E12%2E31; welcome=%20%0D%0A%20%3C%21--%20%3Cspan%20class%3D%22slide%22%3E%u6536%u8D77%3C/span%3E--%3E%0D%0A%20%3Cdiv%20class%3D%22welcome%22%20id%3D%22welcome%22%3E%0D%0A%20%20%3Cdiv%20class%3D%22wel_title%22%3E%20%u8463%u5B66%u52C7%uFF0C%u4E0A%u5348%u597D%uFF0C%u65F6%u95F4%u5B9D%u8D35%uFF0C%u503C%u5F97%u7528%u5FC3%uFF01%20%3Cspan%3E%3C/span%3E%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22last_time%22%3E%u4ECA%u5929%u662F%uFF1A2020%u5E742%u670821%u65E5%20%u661F%u671F%u4E94%3C/div%3E%0D%0A%20%20%3Cdiv%20class%3D%22message%22%3E%3Ca%20id%3D%22indexremind%22%20href%3D%22/messageAdmin/remindlist.asp%22%3E%u63D0%u9192%280%29%3C/a%3E%26nbsp%3B%7C%26nbsp%3B%3Ca%20id%3D%22indexmessage%22%20href%3D%22/messageAdmin/resievemessage.asp%22%3E%u6D88%u606F%280%29%3C/a%3E%7C%3Ca%20href%3D%22http%3A//mail.cmr.com.cn/mailinfc/%22%20target%3D%22_blank%22%3E%u90AE%u7BB1%3C/a%3E%3C/div%3E%0D%0A%20%3C/div%3E%0D%0A%0D%0A%0D%0A; ASPSESSIONIDSQTRATSR=MLGIHCADAGCCCJCADIOJLLON; Hm_lpvt_63c81042df1689f7de2fdd676b8d0301=1582255486; S_T=MjAyMC0yLTIxIDExOjI1OjAuNjM2; E_T=MjAyMC0yLTIxIDExOjI1OjMwLjcyMA%3D%3D\n");
//        response.setHeader("User-Agent",
//                "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_3) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.116 Safari/537.36\n");
        return "android";

    }

}
