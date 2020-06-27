package design.dunzo;

public class Ingredient {
	private final String name;
	

	public Ingredient(final String name) {
		this.name = Objects.requireNonNull(name, "name");
	}

	public String getName() {
		return name;
	}

	public BigDecimal getCost() {
		return cost;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;

		Ingredient that = (Ingredient) obj;

		if (cost.compareTo(that.cost) != 0)
			return false;
		if (!name.equals(that.name))
			return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = name.hashCode();
		result = 31 * result + cost.hashCode();
		return result;
	}

	@Override
	public String toString() {
		return "(" + name + ", " + cost + ")";
	}

	public static IngredientSearcher createSearcher(final Collection<? extends Ingredient> ingredients) {
		return new IngredientSearcher(ingredients);
	}

}
