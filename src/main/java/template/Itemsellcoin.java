package template;

import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONValue;

public class Itemsellcoin {

    public static List<Itemsellcoin> entry = new ArrayList<>();
    public short id;
    public List<Option> op;
    public int price;
    public byte color;

    static {
        String medal
                = "   [[4587,[[2,1000],[96,10]],4,50000],"
                + "[4590,[[3,1000],[96,10]],4,50000],"
                + "[4589,[[4,1000],[96,10]],4,50000],"
                + "[4588,[[1,1000],[96,10]],4,50000]]";
        String tt = "[[4756,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],4,100000]," // giáp ma tốc độ
                //+ "[4757,[[15,2000],[27,2000]],4,50000]," // mặt nạ ma tốc độ
                + "[4716,[[23,10],[24,10],[25,10],[26,10],[27,1000],[30,1000]],5,50000]" // khẩu trang xanh
                + "[4717,[[23,15],[24,15],[25,15],[26,15],[27,1500],[29,1500]],5,100000]" // khẩu trang đỏ
                + "[4718,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[-76, 1000]],5,50000]" // tai nghe phong cách
                + "[4719,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[-76, 1500]],5,100000]" // tai nghe mộng mơ
                // áo choàng
                + "[4676,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4677,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4678,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4679,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4680,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4681,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4682,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4683,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4684,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4685,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4686,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4687,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,100000]"
                + "[4688,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,200000]"
                + "[4689,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,200000]"
                + "[4690,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,200000]"
                //+ "[4746,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[37,1],[27,3000]],4,200000]"
                //+ "[4747,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,120000]"
                //+ "[4748,[[7,1500],[8,1500],[9,1500],[10,1500],[11,1500],[27,1500],[28,1500]],5,750000]"
                // danh hiệu
                //+ "[4765,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4766,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                + "[4767,[[7,500],[8,500],[9,500],[10,500],[11,500],[27,500]],5,50000]"
                //+ "[4720,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4721,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4722,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4723,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4724,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4725,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4726,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4775,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4776,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4777,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4778,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4779,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4780,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4781,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4782,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                //+ "[4783,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000]],5,200000]"
                // giáp siêu nhân
                //+ "[4784,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                //+ "[4785,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                // + "[4786,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                //+ "[4787,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,3000],[15,3000],[5,500],[6,500]],5,500000]"
                //tóc thời trang
                + "[4700,[[23,10],[24,10],[25,10],[26,10]],5,100000]"
                + "[4703,[[23,10],[24,10],[25,10],[26,10]],5,100000]"
                + "[4704,[[23,10],[24,10],[25,10],[26,10]],5,100000]"
                + "[4705,[[23,10],[24,10],[25,10],[26,10]],5,100000]"
                + "[4706,[[23,10],[24,10],[25,10],[26,10]],5,100000]"
                // cánh thời trang
                //+ "[4707,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4712,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4713,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4773,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4774,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4789,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4790,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4792,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4793,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4794,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4795,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4796,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4797,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4638,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4639,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4640,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                //+ "[4641,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,150000]"
                + "[4642,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,100000]"
                + "[4643,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,100000]"
                + "[4644,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,100000]"
                + "[4645,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000]],5,100000]"
                + "[4646,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500],[27,2500]],5,200000]"
                + "[4647,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500],[27,2500]],5,200000]"
                + "[4648,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500],[27,2500]],5,200000]"
                // trứng
                //+ "[3269,[],5,100000]"
                //+ "[3616,[],5,150000]"
                //+ "[4622,[],5,100000]"
                //+ "[4708,[],5,100000]"
                //+ "[4788,[],5,100000]"
                //+ "[4617,[],5,100000]"
                //+ "[4626,[],5,150000]"
                + "[4631,[],5,100000]"
                + "[4699,[],5,100000]"
                + "[4761,[],5,100000]"
                + "[4762,[],5,100000]"
                + "[4768,[],5,100000]"
                + "[2940,[[23,35],[24,35],[25,35],[26,35],[37,2]],5,400000]" // dây chuyền mặt trăng
                // tb2: ở ô tia sét
                + "[4791,[[7,1000],[8,1000],[9,1000],[10,1000],[11,1000]],5,100000]"
                //+ "[4709,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                //+ "[4710,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                //+ "[4792,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4691,[[23,100],[24,100],[25,100],[26,100],[35,2000],[89,500]],5,2000000]"
                + "[4692,[[23,100],[24,100],[25,100],[26,100],[33,2000],[89,500]],5,2000000]"
                + "[4693,[[23,100],[24,100],[25,100],[26,100],[34,2000],[89,500]],5,2000000]"
                + "[4694,[[23,100],[24,100],[25,100],[26,100],[36,2000],[89,500]],5,2000000]"
                + "[4755,[[7,1000],[8,1000],[9,1000],[10,1000],[11,1000]],5,100000]"
                + "[4730,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000]],5,200000]"
                + "[4731,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000]],5,200000]"
                // huy chuong
                + "[4652,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000]],5,200000]"
                //+ "[4650,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4651,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4649,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                // huy hieu
                + "[4728,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000]],5,200000]"
                // + "[4729,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                // + "[4653,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                // mặt nạ
                + "[4632,[[23,15],[24,15],[25,15],[26,15],[27,1500],[29,1500]],5,100000]"
                + "[4633,[[23,15],[24,15],[25,15],[26,15],[27,1500],[29,1500]],5,100000]"
                + "[4634,[[23,15],[24,15],[25,15],[26,15],[27,1500],[29,1500]],5,100000]"
                + "[4635,[[23,15],[24,15],[25,15],[26,15],[27,1500],[29,1500]],5,100000]"
                //+ "[4636,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                + "[4732,[[108,1],[27,5000],[29,2000],[28,5000],[30,2000]],5,2000000]"
                + "[4733,[[109,1000],[7,3500],[8,3500],[9,3500],[10,3500],[11,3500]],5,2000000]"
                + "[4734,[[110,1000],[14,5000],[15,3500],[16,2000],[17,2000],[18,2000],[19,2000],[20,2000],[21,2000],[22,2000]],5,2000000]"
                + "[4735,[[111,100],[33,1500],[34,1500],[35,1500],[36,1500],[37,1],[38,1]],5,2000000]"
                //+ "[4736,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                //+ "[4737,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                //+ "[4738,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                //+ "[4739,[[7,2500],[8,2500],[9,2500],[10,2500],[11,2500]],5,200000]"
                //giáp[7,10000],[8,10000],[9,10000],[10,10000],[11,10000],[27,10000],[37,1],[38,1]
                + "[3604,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3607,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3608,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3611,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3612,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3613,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3614,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[3615,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4585,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4586,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4591,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4592,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4593,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4616,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4618,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4627,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4628,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4629,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4630,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4637,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4655,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4654,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4696,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4697,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4698,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4711,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4740,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                + "[4741,[[7,2000],[8,2000],[9,2000],[10,2000],[11,2000],[27,2000],[28,2000]],5,100000]"
                //+ "[4742,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4743,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4744,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4745,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4749,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4750,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4751,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4752,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4763,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4764,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4758,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4759,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[4760,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[3265,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                //+ "[3267,[[7,3000],[8,3000],[9,3000],[10,3000],[11,3000],[27,2000],[37,1],[38,1]],5,200000]"
                + "]";
        JSONArray js = (JSONArray) JSONValue.parse(medal);
        for (int i = 0; i < js.size(); i++) {
            Itemsellcoin temp = new Itemsellcoin();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
            temp.op = new ArrayList<>();
            JSONArray js3 = (JSONArray) JSONValue.parse(js2.get(1).toString());
            for (int j = 0; j < js3.size(); j++) {
                JSONArray js4 = (JSONArray) JSONValue.parse(js3.get(j).toString());
                temp.op.add(new Option(Byte.parseByte(js4.get(0).toString()), Integer.parseInt(js4.get(1).toString())));
            }
            temp.color = Byte.parseByte(js2.get(2).toString());
            temp.price = Integer.parseInt(js2.get(3).toString());
            Itemsellcoin.entry.add(temp);
        }
        //
        js.clear();
        js = (JSONArray) JSONValue.parse(tt);
        for (int i = 0; i < js.size(); i++) {
            Itemsellcoin temp = new Itemsellcoin();
            JSONArray js2 = (JSONArray) JSONValue.parse(js.get(i).toString());
            temp.id = Short.parseShort(js2.get(0).toString());
            temp.op = new ArrayList<>();
            JSONArray js3 = (JSONArray) JSONValue.parse(js2.get(1).toString());
            for (int j = 0; j < js3.size(); j++) {
                JSONArray js4 = (JSONArray) JSONValue.parse(js3.get(j).toString());
                temp.op.add(new Option(Byte.parseByte(js4.get(0).toString()), Integer.parseInt(js4.get(1).toString())));
            }
            temp.color = Byte.parseByte(js2.get(2).toString());
            temp.price = Integer.parseInt(js2.get(3).toString());
            Itemsellcoin.entry.add(temp);
        }
    }
}