package b7_abstract_interface.thuc_hanh.comparable;

import b6_ke_thua.thuc_hanh.he_cac_doi_tuong_hinh_hoc.Circle;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {
    @Override
    public int compareTo(ComparableCircle o) {
    return (int) (this.getRadius()-o.getRadius());
    }
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    public ComparableCircle(double radius, String color, boolean filled) {
        super(radius, color, filled);
    }
}
