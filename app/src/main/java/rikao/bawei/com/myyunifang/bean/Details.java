package rikao.bawei.com.myyunifang.bean;

import java.util.List;

/**
 * Created by Administrator on 2017/4/21.
 */

public class Details {
    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * goods : {"id":"684","goods_sn":"6951439941676","goods_name":"解救肌渴丨花粹水润面膜套装10片","stock_number":928,"collect_count":6063,"market_price":139,"shop_price":29.9,"shipping_fee":10,"goods_desc":"[{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/170420235422618584246491428.jpg\",\"width\":\"790\",\"height\":\"476\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/170420235422418575011283778.jpg\",\"width\":\"790\",\"height\":\"340\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/170420235435218565776078970.jpg\",\"width\":\"790\",\"height\":\"340\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230120510127625795266.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230129910118390582987.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230132910109155379397.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230198010099920167006.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230198810090684955302.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230138910081449747266.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230138910072214531165.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230182710062979324832.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230185510053744116768.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423018279850569496486.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423018389841334283183.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423016899832099073820.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423017029822863864383.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423015019813628652695.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423014999804393441582.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423017589795158231122.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423017989785923022024.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/1605042301679776687813431.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/1605042301829767452609518.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423019239564277985222.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423019579555042778658.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423013609545807565923.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423014609536572355906.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011699527337145255.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011689518101931408.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423015699508866727485.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423015809499631511543.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011209490396305702.jpg\",\"width\":\"790\",\"height\":\"417\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011259481161096087.jpg\",\"width\":\"790\",\"height\":\"416\"},{\"url\":\"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/161206181646813413128774411.jpg\",\"width\":\"790\",\"height\":\"352\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025516467283569251.jpg\",\"width\":\"790\",\"height\":\"662\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/17033114066620099894394425.jpg\",\"width\":\"790\",\"height\":\"218\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025762485753989290.jpg\",\"width\":\"790\",\"height\":\"662\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025814494989196626.jpg\",\"width\":\"790\",\"height\":\"661\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949504224405918.jpg\",\"width\":\"790\",\"height\":\"662\"},{\"url\":\"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949513459611883.jpg\",\"width\":\"790\",\"height\":\"661\"}]","goods_img":"http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg","is_on_sale":"1","quality":0,"valueformoney":0,"desmatch":0,"sales_volume":87672,"reservable":false,"createuser":"hani","lastupdateuser":"leiqi","restriction":0,"restrict_purchase_num":5,"is_activity_goods":"0","is_coupon_allowed":false,"allocated_stock":23,"gallery":[{"id":"4421","sort":0,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg","enable":true},{"id":"4721","sort":1,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114481614464134629296.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114481614464134629296.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114481614464134629296.jpg","enable":true},{"id":"4722","sort":2,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114486316483729977148.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114486316483729977148.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114486316483729977148.jpg","enable":true},{"id":"4723","sort":3,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114442316465259554950.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114442316465259554950.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114442316465259554950.jpg","enable":true},{"id":"4724","sort":4,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16061311442312565124247339.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16061311442312565124247339.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16061311442312565124247339.jpg","enable":true}],"attributes":[{"id":"2765","goods_id":"684","attr_name":"上市时间","attr_value":"2016年"},{"id":"2766","goods_id":"684","attr_name":"适合肤质","attr_value":"中性、干性、油性及混合性"},{"id":"2767","goods_id":"684","attr_name":"保质期","attr_value":"三年"},{"id":"2768","goods_id":"684","attr_name":"产品功效","attr_value":"补水保湿 柔嫩肌肤"},{"id":"2769","goods_id":"684","attr_name":"产品规格","attr_value":"30ml*10片"}],"efficacy":"水润充盈 鲜嫩少女肌","is_gift":0,"goods_source":"0","redeem_goods_restrict_flag":"0","is_allow_credit":"0","commission_scale":0,"goods_type":"0","datagoodtype":0,"categorys":["9","14","13","29","28","17"]}
         * collected : false
         * reserved : false
         * commentNumber : 34108
         * comments : [{"id":"1342654","createtime":"2017.04.21 16:01:55","content":"好评","user":{"id":"5149440","nick_name":"ynf_3710","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342647","createtime":"2017.04.21 15:52:59","content":"好评","user":{"id":"1639364","nick_name":"(*^__^*)嘻嘻","icon":"https://image.yunifang.com/yunifang/images/user/170121174339914215322122970.jpg"}},{"id":"1342632","createtime":"2017.04.21 15:31:07","content":"好评!","user":{"id":"4071387","nick_name":"ynf_5602","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342600","createtime":"2017.04.21 14:56:48","content":"好评","user":{"id":"2279484","nick_name":"ynf_7739","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342542","createtime":"2017.04.21 13:19:16","content":"好评!","user":{"id":"3048305","nick_name":"ynf_6519","icon":"http://image.hmeili.com/yunifang/images/user/16103102067148792942581385.jpg"}},{"id":"1342534","createtime":"2017.04.21 13:07:45","content":"好评","user":{"id":"5111075","nick_name":"ynf_3188","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342531","createtime":"2017.04.21 13:04:45","content":"好评!","user":{"id":"4631277","nick_name":"ynf_5859","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342523","createtime":"2017.04.21 12:56:02","content":"好评","user":{"id":"3402800","nick_name":"ynf_6840","icon":"https://image.yunifang.com/yunifang/images/user/170421095317314215322123601.jpg"}},{"id":"1342516","createtime":"2017.04.21 12:50:40","content":"好评","user":{"id":"1687378","nick_name":"Melody","icon":"http://image.hmeili.com/yunifang/images/user/160331145413614215322122737.jpg"}},{"id":"1342506","createtime":"2017.04.21 12:40:38","content":"这个面膜是回购的，上次搭配买了一盒，很好用","user":{"id":"5082766","nick_name":"莎妖","icon":"https://image.yunifang.com/yunifang/images/user/170405145394414215322125431.jpg"}},{"id":"1342499","createtime":"2017.04.21 12:37:01","content":"好评","user":{"id":"3798207","nick_name":"ynf_1030","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342436","createtime":"2017.04.21 11:15:05","content":"好评","user":{"id":"1084512","nick_name":"馨儿","icon":"http://image.hmeili.com/yunifang/images/user/160809003695014215322124320.jpg"}},{"id":"1342433","createtime":"2017.04.21 11:14:43","content":"好评","user":{"id":"3664958","nick_name":"ynf_7424","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}},{"id":"1342418","createtime":"2017.04.21 11:06:14","content":"好评  好喜欢，经济实惠，物流也快，用完下次再来😉","user":{"id":"3512738","nick_name":"ynf_0892","icon":"http://image.hmeili.com/yunifang/images/user/16110612391014215322123793.jpg"}},{"id":"1342416","createtime":"2017.04.21 11:05:10","content":"好评","user":{"id":"1945911","nick_name":"小敏子","icon":"http://image.hmeili.com/yunifang/images/user/160603000093514215322125161.jpg"}},{"id":"1342410","createtime":"2017.04.21 11:04:23","content":"下次再来下次再来下次再来下次再来下次再来下次再来下次再来下次再来下次再来","user":{"id":"322222","nick_name":"ynf_6852","icon":"http://image.hmeili.com/yunifang/images/userIcon/icon.png"}}]
         * activity : [{"id":"36","title":"实付满49元包邮","description":"http://h.yunifang.com/h/postage.html"},{"id":"25","title":"海量赠品任选·满69自选","description":"http://h.yunifang.com/h/11_meet.html"},{"id":"21","title":"购物须知·客服时间8:30-23:30","description":"http://h.yunifang.com/h/shopping_tips.html"}]
         * matchPriceRule : {"id":"70","createtime":"2017.03.22 17:05:04","title":"搭配买立省59元丨春季护肤必备","subtitle":"无","amount":129.9,"rebate_money":59,"restriction":5,"begin_date":"2017.04.11 10:10:30","end_date":"2017.04.30 23:59:00","state":1,"descript":"搭配购买好划算，还不来看看~","createuser":"hani","goodsList":[{"id":"684","goods_name":"解救肌渴丨花粹水润面膜套装10片","stock_number":0,"collect_count":0,"shop_price":29.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg","quality":5,"valueformoney":5,"desmatch":5,"sales_volume":0,"reservable":false,"restriction":0,"restrict_purchase_num":0,"is_coupon_allowed":false,"allocated_stock":0,"is_gift":0,"is_allow_credit":"0"},{"id":"596","goods_name":"薰衣草补水舒缓护肤三件套","stock_number":0,"collect_count":0,"shop_price":159,"goods_img":"http://image.hmeili.com/yunifang/images/goods/596/goods_img/16081909464073809280443780.jpg","quality":5,"valueformoney":5,"desmatch":5,"sales_volume":0,"reservable":false,"restriction":0,"restrict_purchase_num":0,"is_coupon_allowed":true,"allocated_stock":0,"is_gift":0,"is_allow_credit":"1"}],"actStatus":"1","matchPriceRuleEnable":"1"}
         */

        private GoodsBean goods;
        private boolean collected;
        private boolean reserved;
        private int commentNumber;
        private MatchPriceRuleBean matchPriceRule;
        private List<CommentsBean> comments;
        private List<ActivityBean> activity;

        public GoodsBean getGoods() {
            return goods;
        }

        public void setGoods(GoodsBean goods) {
            this.goods = goods;
        }

        public boolean isCollected() {
            return collected;
        }

        public void setCollected(boolean collected) {
            this.collected = collected;
        }

        public boolean isReserved() {
            return reserved;
        }

        public void setReserved(boolean reserved) {
            this.reserved = reserved;
        }

        public int getCommentNumber() {
            return commentNumber;
        }

        public void setCommentNumber(int commentNumber) {
            this.commentNumber = commentNumber;
        }

        public MatchPriceRuleBean getMatchPriceRule() {
            return matchPriceRule;
        }

        public void setMatchPriceRule(MatchPriceRuleBean matchPriceRule) {
            this.matchPriceRule = matchPriceRule;
        }

        public List<CommentsBean> getComments() {
            return comments;
        }

        public void setComments(List<CommentsBean> comments) {
            this.comments = comments;
        }

        public List<ActivityBean> getActivity() {
            return activity;
        }

        public void setActivity(List<ActivityBean> activity) {
            this.activity = activity;
        }

        public static class GoodsBean {
            /**
             * id : 684
             * goods_sn : 6951439941676
             * goods_name : 解救肌渴丨花粹水润面膜套装10片
             * stock_number : 928
             * collect_count : 6063
             * market_price : 139.0
             * shop_price : 29.9
             * shipping_fee : 10.0
             * goods_desc : [{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/170420235422618584246491428.jpg","width":"790","height":"476"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/170420235422418575011283778.jpg","width":"790","height":"340"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/170420235435218565776078970.jpg","width":"790","height":"340"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230120510127625795266.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230129910118390582987.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230132910109155379397.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230198010099920167006.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230198810090684955302.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230138910081449747266.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230138910072214531165.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230182710062979324832.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/160504230185510053744116768.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423018279850569496486.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423018389841334283183.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423016899832099073820.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423017029822863864383.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423015019813628652695.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423014999804393441582.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423017589795158231122.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423017989785923022024.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/1605042301679776687813431.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/1605042301829767452609518.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423019239564277985222.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423019579555042778658.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423013609545807565923.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423014609536572355906.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011699527337145255.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011689518101931408.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423015699508866727485.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423015809499631511543.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011209490396305702.jpg","width":"790","height":"417"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/16050423011259481161096087.jpg","width":"790","height":"416"},{"url":"http://image.hmeili.com/yunifang/images/goods/684/goods_desc/161206181646813413128774411.jpg","width":"790","height":"352"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025516467283569251.jpg","width":"790","height":"662"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/17033114066620099894394425.jpg","width":"790","height":"218"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025762485753989290.jpg","width":"790","height":"662"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025814494989196626.jpg","width":"790","height":"661"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949504224405918.jpg","width":"790","height":"662"},{"url":"https://image.yunifang.com/yunifang/images/goods/ad6/1703101025949513459611883.jpg","width":"790","height":"661"}]
             * goods_img : http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg
             * is_on_sale : 1
             * quality : 0.0
             * valueformoney : 0.0
             * desmatch : 0.0
             * sales_volume : 87672
             * reservable : false
             * createuser : hani
             * lastupdateuser : leiqi
             * restriction : 0
             * restrict_purchase_num : 5
             * is_activity_goods : 0
             * is_coupon_allowed : false
             * allocated_stock : 23
             * gallery : [{"id":"4421","sort":0,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg","enable":true},{"id":"4721","sort":1,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114481614464134629296.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114481614464134629296.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114481614464134629296.jpg","enable":true},{"id":"4722","sort":2,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114486316483729977148.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114486316483729977148.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114486316483729977148.jpg","enable":true},{"id":"4723","sort":3,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114442316465259554950.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114442316465259554950.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/160613114442316465259554950.jpg","enable":true},{"id":"4724","sort":4,"goods_id":"684","normal_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16061311442312565124247339.jpg","thumb_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16061311442312565124247339.jpg","original_url":"http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16061311442312565124247339.jpg","enable":true}]
             * attributes : [{"id":"2765","goods_id":"684","attr_name":"上市时间","attr_value":"2016年"},{"id":"2766","goods_id":"684","attr_name":"适合肤质","attr_value":"中性、干性、油性及混合性"},{"id":"2767","goods_id":"684","attr_name":"保质期","attr_value":"三年"},{"id":"2768","goods_id":"684","attr_name":"产品功效","attr_value":"补水保湿 柔嫩肌肤"},{"id":"2769","goods_id":"684","attr_name":"产品规格","attr_value":"30ml*10片"}]
             * efficacy : 水润充盈 鲜嫩少女肌
             * is_gift : 0
             * goods_source : 0
             * redeem_goods_restrict_flag : 0
             * is_allow_credit : 0
             * commission_scale : 0.0
             * goods_type : 0
             * datagoodtype : 0
             * categorys : ["9","14","13","29","28","17"]
             */

            private String id;
            private String goods_sn;
            private String goods_name;
            private int stock_number;
            private int collect_count;
            private double market_price;
            private double shop_price;
            private double shipping_fee;
            private String goods_desc;
            private String goods_img;
            private String is_on_sale;
            private double quality;
            private double valueformoney;
            private double desmatch;
            private int sales_volume;
            private boolean reservable;
            private String createuser;
            private String lastupdateuser;
            private int restriction;
            private int restrict_purchase_num;
            private String is_activity_goods;
            private boolean is_coupon_allowed;
            private int allocated_stock;
            private String efficacy;
            private int is_gift;
            private String goods_source;
            private String redeem_goods_restrict_flag;
            private String is_allow_credit;
            private double commission_scale;
            private String goods_type;
            private int datagoodtype;
            private List<GalleryBean> gallery;
            private List<AttributesBean> attributes;
            private List<String> categorys;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getGoods_sn() {
                return goods_sn;
            }

            public void setGoods_sn(String goods_sn) {
                this.goods_sn = goods_sn;
            }

            public String getGoods_name() {
                return goods_name;
            }

            public void setGoods_name(String goods_name) {
                this.goods_name = goods_name;
            }

            public int getStock_number() {
                return stock_number;
            }

            public void setStock_number(int stock_number) {
                this.stock_number = stock_number;
            }

            public int getCollect_count() {
                return collect_count;
            }

            public void setCollect_count(int collect_count) {
                this.collect_count = collect_count;
            }

            public double getMarket_price() {
                return market_price;
            }

            public void setMarket_price(double market_price) {
                this.market_price = market_price;
            }

            public double getShop_price() {
                return shop_price;
            }

            public void setShop_price(double shop_price) {
                this.shop_price = shop_price;
            }

            public double getShipping_fee() {
                return shipping_fee;
            }

            public void setShipping_fee(double shipping_fee) {
                this.shipping_fee = shipping_fee;
            }

            public String getGoods_desc() {
                return goods_desc;
            }

            public void setGoods_desc(String goods_desc) {
                this.goods_desc = goods_desc;
            }

            public String getGoods_img() {
                return goods_img;
            }

            public void setGoods_img(String goods_img) {
                this.goods_img = goods_img;
            }

            public String getIs_on_sale() {
                return is_on_sale;
            }

            public void setIs_on_sale(String is_on_sale) {
                this.is_on_sale = is_on_sale;
            }

            public double getQuality() {
                return quality;
            }

            public void setQuality(double quality) {
                this.quality = quality;
            }

            public double getValueformoney() {
                return valueformoney;
            }

            public void setValueformoney(double valueformoney) {
                this.valueformoney = valueformoney;
            }

            public double getDesmatch() {
                return desmatch;
            }

            public void setDesmatch(double desmatch) {
                this.desmatch = desmatch;
            }

            public int getSales_volume() {
                return sales_volume;
            }

            public void setSales_volume(int sales_volume) {
                this.sales_volume = sales_volume;
            }

            public boolean isReservable() {
                return reservable;
            }

            public void setReservable(boolean reservable) {
                this.reservable = reservable;
            }

            public String getCreateuser() {
                return createuser;
            }

            public void setCreateuser(String createuser) {
                this.createuser = createuser;
            }

            public String getLastupdateuser() {
                return lastupdateuser;
            }

            public void setLastupdateuser(String lastupdateuser) {
                this.lastupdateuser = lastupdateuser;
            }

            public int getRestriction() {
                return restriction;
            }

            public void setRestriction(int restriction) {
                this.restriction = restriction;
            }

            public int getRestrict_purchase_num() {
                return restrict_purchase_num;
            }

            public void setRestrict_purchase_num(int restrict_purchase_num) {
                this.restrict_purchase_num = restrict_purchase_num;
            }

            public String getIs_activity_goods() {
                return is_activity_goods;
            }

            public void setIs_activity_goods(String is_activity_goods) {
                this.is_activity_goods = is_activity_goods;
            }

            public boolean isIs_coupon_allowed() {
                return is_coupon_allowed;
            }

            public void setIs_coupon_allowed(boolean is_coupon_allowed) {
                this.is_coupon_allowed = is_coupon_allowed;
            }

            public int getAllocated_stock() {
                return allocated_stock;
            }

            public void setAllocated_stock(int allocated_stock) {
                this.allocated_stock = allocated_stock;
            }

            public String getEfficacy() {
                return efficacy;
            }

            public void setEfficacy(String efficacy) {
                this.efficacy = efficacy;
            }

            public int getIs_gift() {
                return is_gift;
            }

            public void setIs_gift(int is_gift) {
                this.is_gift = is_gift;
            }

            public String getGoods_source() {
                return goods_source;
            }

            public void setGoods_source(String goods_source) {
                this.goods_source = goods_source;
            }

            public String getRedeem_goods_restrict_flag() {
                return redeem_goods_restrict_flag;
            }

            public void setRedeem_goods_restrict_flag(String redeem_goods_restrict_flag) {
                this.redeem_goods_restrict_flag = redeem_goods_restrict_flag;
            }

            public String getIs_allow_credit() {
                return is_allow_credit;
            }

            public void setIs_allow_credit(String is_allow_credit) {
                this.is_allow_credit = is_allow_credit;
            }

            public double getCommission_scale() {
                return commission_scale;
            }

            public void setCommission_scale(double commission_scale) {
                this.commission_scale = commission_scale;
            }

            public String getGoods_type() {
                return goods_type;
            }

            public void setGoods_type(String goods_type) {
                this.goods_type = goods_type;
            }

            public int getDatagoodtype() {
                return datagoodtype;
            }

            public void setDatagoodtype(int datagoodtype) {
                this.datagoodtype = datagoodtype;
            }

            public List<GalleryBean> getGallery() {
                return gallery;
            }

            public void setGallery(List<GalleryBean> gallery) {
                this.gallery = gallery;
            }

            public List<AttributesBean> getAttributes() {
                return attributes;
            }

            public void setAttributes(List<AttributesBean> attributes) {
                this.attributes = attributes;
            }

            public List<String> getCategorys() {
                return categorys;
            }

            public void setCategorys(List<String> categorys) {
                this.categorys = categorys;
            }

            public static class GalleryBean {
                /**
                 * id : 4421
                 * sort : 0
                 * goods_id : 684
                 * normal_url : http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg
                 * thumb_url : http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg
                 * original_url : http://image.hmeili.com/yunifang/images/goods/684/goods_gallery/16050919349320132941245326.jpg
                 * enable : true
                 */

                private String id;
                private int sort;
                private String goods_id;
                private String normal_url;
                private String thumb_url;
                private String original_url;
                private boolean enable;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public int getSort() {
                    return sort;
                }

                public void setSort(int sort) {
                    this.sort = sort;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getNormal_url() {
                    return normal_url;
                }

                public void setNormal_url(String normal_url) {
                    this.normal_url = normal_url;
                }

                public String getThumb_url() {
                    return thumb_url;
                }

                public void setThumb_url(String thumb_url) {
                    this.thumb_url = thumb_url;
                }

                public String getOriginal_url() {
                    return original_url;
                }

                public void setOriginal_url(String original_url) {
                    this.original_url = original_url;
                }

                public boolean isEnable() {
                    return enable;
                }

                public void setEnable(boolean enable) {
                    this.enable = enable;
                }
            }

            public static class AttributesBean {
                /**
                 * id : 2765
                 * goods_id : 684
                 * attr_name : 上市时间
                 * attr_value : 2016年
                 */

                private String id;
                private String goods_id;
                private String attr_name;
                private String attr_value;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getGoods_id() {
                    return goods_id;
                }

                public void setGoods_id(String goods_id) {
                    this.goods_id = goods_id;
                }

                public String getAttr_name() {
                    return attr_name;
                }

                public void setAttr_name(String attr_name) {
                    this.attr_name = attr_name;
                }

                public String getAttr_value() {
                    return attr_value;
                }

                public void setAttr_value(String attr_value) {
                    this.attr_value = attr_value;
                }
            }
        }

        public static class MatchPriceRuleBean {
            /**
             * id : 70
             * createtime : 2017.03.22 17:05:04
             * title : 搭配买立省59元丨春季护肤必备
             * subtitle : 无
             * amount : 129.9
             * rebate_money : 59.0
             * restriction : 5
             * begin_date : 2017.04.11 10:10:30
             * end_date : 2017.04.30 23:59:00
             * state : 1
             * descript : 搭配购买好划算，还不来看看~
             * createuser : hani
             * goodsList : [{"id":"684","goods_name":"解救肌渴丨花粹水润面膜套装10片","stock_number":0,"collect_count":0,"shop_price":29.9,"goods_img":"http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg","quality":5,"valueformoney":5,"desmatch":5,"sales_volume":0,"reservable":false,"restriction":0,"restrict_purchase_num":0,"is_coupon_allowed":false,"allocated_stock":0,"is_gift":0,"is_allow_credit":"0"},{"id":"596","goods_name":"薰衣草补水舒缓护肤三件套","stock_number":0,"collect_count":0,"shop_price":159,"goods_img":"http://image.hmeili.com/yunifang/images/goods/596/goods_img/16081909464073809280443780.jpg","quality":5,"valueformoney":5,"desmatch":5,"sales_volume":0,"reservable":false,"restriction":0,"restrict_purchase_num":0,"is_coupon_allowed":true,"allocated_stock":0,"is_gift":0,"is_allow_credit":"1"}]
             * actStatus : 1
             * matchPriceRuleEnable : 1
             */

            private String id;
            private String createtime;
            private String title;
            private String subtitle;
            private double amount;
            private double rebate_money;
            private int restriction;
            private String begin_date;
            private String end_date;
            private int state;
            private String descript;
            private String createuser;
            private String actStatus;
            private String matchPriceRuleEnable;
            private List<GoodsListBean> goodsList;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getSubtitle() {
                return subtitle;
            }

            public void setSubtitle(String subtitle) {
                this.subtitle = subtitle;
            }

            public double getAmount() {
                return amount;
            }

            public void setAmount(double amount) {
                this.amount = amount;
            }

            public double getRebate_money() {
                return rebate_money;
            }

            public void setRebate_money(double rebate_money) {
                this.rebate_money = rebate_money;
            }

            public int getRestriction() {
                return restriction;
            }

            public void setRestriction(int restriction) {
                this.restriction = restriction;
            }

            public String getBegin_date() {
                return begin_date;
            }

            public void setBegin_date(String begin_date) {
                this.begin_date = begin_date;
            }

            public String getEnd_date() {
                return end_date;
            }

            public void setEnd_date(String end_date) {
                this.end_date = end_date;
            }

            public int getState() {
                return state;
            }

            public void setState(int state) {
                this.state = state;
            }

            public String getDescript() {
                return descript;
            }

            public void setDescript(String descript) {
                this.descript = descript;
            }

            public String getCreateuser() {
                return createuser;
            }

            public void setCreateuser(String createuser) {
                this.createuser = createuser;
            }

            public String getActStatus() {
                return actStatus;
            }

            public void setActStatus(String actStatus) {
                this.actStatus = actStatus;
            }

            public String getMatchPriceRuleEnable() {
                return matchPriceRuleEnable;
            }

            public void setMatchPriceRuleEnable(String matchPriceRuleEnable) {
                this.matchPriceRuleEnable = matchPriceRuleEnable;
            }

            public List<GoodsListBean> getGoodsList() {
                return goodsList;
            }

            public void setGoodsList(List<GoodsListBean> goodsList) {
                this.goodsList = goodsList;
            }

            public static class GoodsListBean {
                /**
                 * id : 684
                 * goods_name : 解救肌渴丨花粹水润面膜套装10片
                 * stock_number : 0
                 * collect_count : 0
                 * shop_price : 29.9
                 * goods_img : http://image.hmeili.com/yunifang/images/goods/684/goods_img/160819095063413908186337181.jpg
                 * quality : 5.0
                 * valueformoney : 5.0
                 * desmatch : 5.0
                 * sales_volume : 0
                 * reservable : false
                 * restriction : 0
                 * restrict_purchase_num : 0
                 * is_coupon_allowed : false
                 * allocated_stock : 0
                 * is_gift : 0
                 * is_allow_credit : 0
                 */

                private String id;
                private String goods_name;
                private int stock_number;
                private int collect_count;
                private double shop_price;
                private String goods_img;
                private double quality;
                private double valueformoney;
                private double desmatch;
                private int sales_volume;
                private boolean reservable;
                private int restriction;
                private int restrict_purchase_num;
                private boolean is_coupon_allowed;
                private int allocated_stock;
                private int is_gift;
                private String is_allow_credit;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getGoods_name() {
                    return goods_name;
                }

                public void setGoods_name(String goods_name) {
                    this.goods_name = goods_name;
                }

                public int getStock_number() {
                    return stock_number;
                }

                public void setStock_number(int stock_number) {
                    this.stock_number = stock_number;
                }

                public int getCollect_count() {
                    return collect_count;
                }

                public void setCollect_count(int collect_count) {
                    this.collect_count = collect_count;
                }

                public double getShop_price() {
                    return shop_price;
                }

                public void setShop_price(double shop_price) {
                    this.shop_price = shop_price;
                }

                public String getGoods_img() {
                    return goods_img;
                }

                public void setGoods_img(String goods_img) {
                    this.goods_img = goods_img;
                }

                public double getQuality() {
                    return quality;
                }

                public void setQuality(double quality) {
                    this.quality = quality;
                }

                public double getValueformoney() {
                    return valueformoney;
                }

                public void setValueformoney(double valueformoney) {
                    this.valueformoney = valueformoney;
                }

                public double getDesmatch() {
                    return desmatch;
                }

                public void setDesmatch(double desmatch) {
                    this.desmatch = desmatch;
                }

                public int getSales_volume() {
                    return sales_volume;
                }

                public void setSales_volume(int sales_volume) {
                    this.sales_volume = sales_volume;
                }

                public boolean isReservable() {
                    return reservable;
                }

                public void setReservable(boolean reservable) {
                    this.reservable = reservable;
                }

                public int getRestriction() {
                    return restriction;
                }

                public void setRestriction(int restriction) {
                    this.restriction = restriction;
                }

                public int getRestrict_purchase_num() {
                    return restrict_purchase_num;
                }

                public void setRestrict_purchase_num(int restrict_purchase_num) {
                    this.restrict_purchase_num = restrict_purchase_num;
                }

                public boolean isIs_coupon_allowed() {
                    return is_coupon_allowed;
                }

                public void setIs_coupon_allowed(boolean is_coupon_allowed) {
                    this.is_coupon_allowed = is_coupon_allowed;
                }

                public int getAllocated_stock() {
                    return allocated_stock;
                }

                public void setAllocated_stock(int allocated_stock) {
                    this.allocated_stock = allocated_stock;
                }

                public int getIs_gift() {
                    return is_gift;
                }

                public void setIs_gift(int is_gift) {
                    this.is_gift = is_gift;
                }

                public String getIs_allow_credit() {
                    return is_allow_credit;
                }

                public void setIs_allow_credit(String is_allow_credit) {
                    this.is_allow_credit = is_allow_credit;
                }
            }
        }

        public static class CommentsBean {
            /**
             * id : 1342654
             * createtime : 2017.04.21 16:01:55
             * content : 好评
             * user : {"id":"5149440","nick_name":"ynf_3710","icon":"https://image.yunifang.com/yunifang/images/userIcon/icon.png"}
             */

            private String id;
            private String createtime;
            private String content;
            private UserBean user;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getCreatetime() {
                return createtime;
            }

            public void setCreatetime(String createtime) {
                this.createtime = createtime;
            }

            public String getContent() {
                return content;
            }

            public void setContent(String content) {
                this.content = content;
            }

            public UserBean getUser() {
                return user;
            }

            public void setUser(UserBean user) {
                this.user = user;
            }

            public static class UserBean {
                /**
                 * id : 5149440
                 * nick_name : ynf_3710
                 * icon : https://image.yunifang.com/yunifang/images/userIcon/icon.png
                 */

                private String id;
                private String nick_name;
                private String icon;

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getNick_name() {
                    return nick_name;
                }

                public void setNick_name(String nick_name) {
                    this.nick_name = nick_name;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }
            }
        }

        public static class ActivityBean {
            /**
             * id : 36
             * title : 实付满49元包邮
             * description : http://h.yunifang.com/h/postage.html
             */

            private String id;
            private String title;
            private String description;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getDescription() {
                return description;
            }

            public void setDescription(String description) {
                this.description = description;
            }
        }
    }
}
