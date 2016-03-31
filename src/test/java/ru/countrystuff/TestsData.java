package ru.countrystuff;

import ru.countrystuff.model.Country;
import ru.countrystuff.model.Item;
import ru.countrystuff.model.ItemCategory;
import ru.countrystuff.model.Vendor;

/**
 * Created by RAMSES on 29.03.2016.
 */
public class TestsData {
    public static Country COUNTRY1 = Country.createExisting(-1, "Россия");
    public static Vendor VENDOR1 = Vendor.createExisting(-1, "Grundfos", COUNTRY1);
    public static ItemCategory ITEM_CATEGORY1 = ItemCategory.createExisting(-1, "Насосы");
    public static String IMAGE1 = "unilift_cc.jpg";
    public static String IMAGE2 = "ALPHA3.jpg";
    public static Item ITEM1 = Item.createExisting(
            -1,
            "Unilift CC",
            VENDOR1,
            ITEM_CATEGORY1,
            "Unilift CC это одноступенчатые, погружные, дренажные насосы спроектированные для перекачивания дренажной воды и серых стоков. Насосы Unilift CC могут откачивать воду с уровня до 3 мм над полом при снятии сетчатого фильтра. Насосы даной серии подходят для стационарной а также для временной установки. Насосы Unilift CC оснащаются обратным клапаном с поворотным диском на выходном отверстии, что предотвращает обратный поток из системы трубопровода. Переходник обеспечивает надёжное соединение с выходными отверстиями 3/4 дюйма, 1 дюйма или 1 1/4 дюйма. Сетчатый фильтр выполнен из нержавеющей стали, а основные части насоса, например, муфта и корпус насоса, выполнены из формованных композитных материалов.",
            IMAGE1,
            10000.
    );

    public static Item ITEM2 = Item.createExisting(
            -2,
            "ALPHA3",
            VENDOR1,
            ITEM_CATEGORY1,
            "Представляя Вашему вниманию новый насос APLHA3, Grundfos предлагает переосмыслить роль компактного циркуляционного насоса в системе отопления. Новые возможности использования ALPHA3 позволяют провести профессиональную гидравлическую балансировку двухтрубной системы отопления на РАЗ-ДВА-ТРИ. Кроме того, новые функции и дополнительные встроенные защиты повысили надёжность работы насоса и увеличили устойчивость всей отопительной системы.",
            IMAGE2,
            7000.
    );
}
