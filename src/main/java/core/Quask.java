package core;

import io.Session;
import template.Item3;
import template.ItemTemplate3;
import template.box_item_template;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Quask {
    public static void quask_hon_gio (Session conn, byte index) throws IOException {
        switch (index) {
            case 0: {// thường
                if (conn.p.item.get_bag_able() <= 1) {
                    Service.send_notice_box(conn, "Hành trang đầy");
                    return;
                }
                List<box_item_template> ids = new ArrayList<>();
                List<Integer> duclo = new ArrayList<>(java.util.Arrays.asList(33, 44, 45));
                List<Integer> danangcap = new ArrayList<>(java.util.Arrays.asList(471, 349));
                for (int i = 0; i < 3; i++) {
                    int ran = Util.random(101);
                    if (ran > 90) { // đá nâng cấp
                        short id = Util.random(danangcap, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 85 && ran <= 90) { // nlmd
                        short id = (short) Util.random(46, 346);
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 70 && ran < 80) { // đục
                        short id = Util.random(duclo, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 20 && ran < 50) { // vé mở ly
                        short id = 52;
                        short quant = (short) Util.random(20, 50);
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else {
                        Service.send_notice_box(conn, "Đen vl. Bạn dell đc gì");
                    }
                }
                conn.p.doiqua += 1;
                Service.Show_open_box_notice_item(conn.p, "Bạn nhận được", ids);
                break;
            }
            case 1: {// trung cấp
                if (conn.p.item.get_bag_able() <= 1) {
                    Service.send_notice_box(conn, "Hành trang đầy");
                    return;
                }
                List<box_item_template> ids = new ArrayList<>();
                List<Integer> duclo = new ArrayList<>(java.util.Arrays.asList(33, 44, 45));
                List<Integer> ngockham = new ArrayList<>(java.util.Arrays.asList(354, 359, 364, 369, 374, 379));
                List<Integer> danangcap = new ArrayList<>(java.util.Arrays.asList(471, 350));
                List<Integer> nlmdtim = new ArrayList<>(java.util.Arrays.asList(
                        136, 137, 138, 139, 140, 141,142,143,144,145,
                        236, 237, 238, 239, 240, 241,242,243,244,245,
                        336, 337, 338, 339, 340, 341,342,343,344,345));

                for (int i = 0; i < 3; i++) {
                    int ran = Util.random(101);
                    if (ran > 95 && ran < 99) { // sách 110
                        short iditem =(short) Util.random(4577, 4599);
                        Item3 itbag = new Item3();
                        itbag.id = iditem;
                        itbag.name = ItemTemplate3.item.get(iditem).getName();
                        itbag.clazz = ItemTemplate3.item.get(iditem).getClazz();
                        itbag.type = ItemTemplate3.item.get(iditem).getType();
                        itbag.level = ItemTemplate3.item.get(iditem).getLevel();
                        itbag.icon = ItemTemplate3.item.get(iditem).getIcon();
                        itbag.op = new ArrayList<>();
                        itbag.op.addAll(ItemTemplate3.item.get(iditem).getOp());
                        itbag.color = ItemTemplate3.item.get(iditem).getColor();
                        itbag.part = ItemTemplate3.item.get(iditem).getPart();
                        itbag.tier = 0;
                        itbag.islock = false;
                        itbag.time_use = 0;
                        conn.p.item.add_item_bag3(itbag);
                        conn.p.item.char_inventory(5);
                        ids.add(new box_item_template(iditem, (short) 1, (byte) 3));
                    } else if (ran > 90 && ran < 95) { // rương boss phe
                        short id = 273;
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else if (ran > 85 && ran < 80) { // nlmd
                        short id = Util.random(nlmdtim, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 80 && ran < 85) {// ngọc khảm
                        short id = Util.random(ngockham, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 75 && ran < 80) { // đá nâng cấp
                        short id = Util.random(danangcap, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 70 && ran < 75) { // đục
                        short id = Util.random(duclo, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 60 && ran < 70) { // rương chiến công
                        short id = 274;
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else if (ran > 20 && ran < 50) { // vé mở ly
                        short id = 52;
                        short quant = (short) Util.random(20, 50);
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else {
                        Service.send_notice_box(conn, "Đen vl bạn dell đc gì");
                    }
                }
                conn.p.doiqua += 2;
                Service.Show_open_box_notice_item(conn.p, "Bạn nhận được", ids);
                break;
            }
            case 2: { // cao cấp
                if (conn.p.item.get_bag_able() <= 1) {
                    Service.send_notice_box(conn, "Hành trang đầy");
                    return;
                }
                List<box_item_template> ids = new ArrayList<>();
                List<Integer> duclo = new ArrayList<>(java.util.Arrays.asList(33, 44, 45));
                List<Integer> ngockham = new ArrayList<>(java.util.Arrays.asList(354, 355, 356, 359, 360, 361, 364, 365, 366, 369, 370, 371, 374, 375, 376, 379, 380, 381));
                List<Integer> danangcap = new ArrayList<>(java.util.Arrays.asList(471, 351));
                List<Integer> nlmdtim = new ArrayList<>(java.util.Arrays.asList(
                        136, 137, 138, 139, 140, 141,142,143,144,145,
                        236, 237, 238, 239, 240, 241,242,243,244,245,
                        336, 337, 338, 339, 340, 341,342,343,344,345));

                for (int i = 0; i < 3; i++) {
                    int ran = Util.random(101);
                    if (ran > 100) {// trang bị
                        short iditem = 4800;
                        Item3 itbag = new Item3();
                        itbag.id = iditem;
                        itbag.name = ItemTemplate3.item.get(iditem).getName();
                        itbag.clazz = ItemTemplate3.item.get(iditem).getClazz();
                        itbag.type = ItemTemplate3.item.get(iditem).getType();
                        itbag.level = ItemTemplate3.item.get(iditem).getLevel();
                        itbag.icon = ItemTemplate3.item.get(iditem).getIcon();
                        itbag.op = new ArrayList<>();
                        itbag.op.addAll(ItemTemplate3.item.get(iditem).getOp());
                        itbag.color = ItemTemplate3.item.get(iditem).getColor();
                        itbag.part = ItemTemplate3.item.get(iditem).getPart();
                        itbag.tier = 0;
                        itbag.islock = false;
                        itbag.time_use = 0;
                        conn.p.item.add_item_bag3(itbag);
                        conn.p.item.char_inventory(5);
                        ids.add(new box_item_template(iditem, (short) 1, (byte) 3));
                    } else if (ran > 95 && ran < 99) { // sách 110
                        short iditem =(short) Util.random(4577, 4599);
                        Item3 itbag = new Item3();
                        itbag.id = iditem;
                        itbag.name = ItemTemplate3.item.get(iditem).getName();
                        itbag.clazz = ItemTemplate3.item.get(iditem).getClazz();
                        itbag.type = ItemTemplate3.item.get(iditem).getType();
                        itbag.level = ItemTemplate3.item.get(iditem).getLevel();
                        itbag.icon = ItemTemplate3.item.get(iditem).getIcon();
                        itbag.op = new ArrayList<>();
                        itbag.op.addAll(ItemTemplate3.item.get(iditem).getOp());
                        itbag.color = ItemTemplate3.item.get(iditem).getColor();
                        itbag.part = ItemTemplate3.item.get(iditem).getPart();
                        itbag.tier = 0;
                        itbag.islock = false;
                        itbag.time_use = 0;
                        conn.p.item.add_item_bag3(itbag);
                        conn.p.item.char_inventory(5);
                        ids.add(new box_item_template(iditem, (short) 1, (byte) 3));
                    } else if (ran > 90 && ran < 95) { // rương boss phe
                        short id = 273;
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else if (ran > 85 && ran < 90) { // nlmd
                        short id = Util.random(nlmdtim, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                    } else if (ran > 80 && ran <= 82) { // vp buff
                        short id = (short) Util.random(328,334);
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else if (ran > 77 && ran < 80) { // đồng money
                        short id = 494;
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 70 && ran < 75) {// ngọc khảm
                        short id = Util.random(ngockham, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 65 && ran < 70) { // đá nâng cấp
                        short id = Util.random(danangcap, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 55 && ran < 65) { // đục
                        short id = Util.random(duclo, new ArrayList<>()).shortValue();
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 7));
                        conn.p.item.add_item_bag47(id, quant, (byte) 7);
                    } else if (ran > 30 && ran < 50) { // rương chiến công
                        short id = 274;
                        short quant = 1;
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else if (ran > 10 && ran < 30) { // vé mở ly
                        short id = 52;
                        short quant = (short) Util.random(20, 50);
                        ids.add(new box_item_template(id, quant, (byte) 4));
                        conn.p.item.add_item_bag47(id, quant, (byte) 4);
                    } else {
                        Service.send_notice_box(conn, "Đen vl bạn dell đc gì");
                    }
                }
                conn.p.doiqua += 5;
                Service.Show_open_box_notice_item(conn.p, "Bạn nhận được", ids);
                break;
            }
        }
    }
}
