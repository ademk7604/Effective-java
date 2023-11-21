package com.effectivejava.tutorial.item9a10_OverridingEqualsHashCode;

import java.awt.Color;
import java.util.Objects;

public class ColorPoint {
	/*
	 * ColorPointInherit i Point e extend edecegine
	 * private final Point point; bu sekilde inject edin diyor
	 * Bu sefer genel yazdiginiz equals methodu dogru calisacaktir.
	 */
	private final Point point;
	private final Color color;
	
	// constr. da ekleyin diyor tabi
	public ColorPoint(int x, int y, Color color) {
		point = new Point(x, y);
		this.color = Objects.requireNonNull(color);
	}

	/**
	 * Returns the point-view of this color point.
	 */
	public Point asPoint() {
		return point;
	}

	@Override
	public boolean equals(Object o) {
		if (!(o instanceof ColorPoint))
			return false;
		ColorPoint cp = (ColorPoint) o;
		return cp.point.equals(point) && cp.color.equals(color);
	}

	@Override
	public int hashCode() {
		return 31 * point.hashCode() + color.hashCode();
	}
}
