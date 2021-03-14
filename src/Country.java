public enum Country {
    RUSSIA("Россия", true),
    USA("США", true),
    EASTTIMOR("Восточный Тимор", false);
    private final String ruName;
    private final boolean isOpen;

    Country(final String ruName, final boolean isOpen) {
        this.ruName = ruName;
        this.isOpen = isOpen;
    }

    public static Country getByRuName(final String ruName) throws NoSuchCountryException {
        for (Country c : Country.values()) {
            if (ruName.equals(c.ruName)) {
                return c;
            }
        }
        throw new NoSuchCountryException();
    }

    public void printInfo() {
        if (isOpen) {
            System.out.println("Страна [" + this + "] открыта для посещения.");
        } else {
            System.out.println("Страна [" + this + "] закрыта для посещения.");
        }
    }

    @Override
    public String toString() {
        return this.name() + " (" + this.ruName + ")";
    }
}
