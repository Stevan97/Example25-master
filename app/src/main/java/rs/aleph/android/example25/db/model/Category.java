package rs.aleph.android.example25.db.model;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

@DatabaseTable(tableName = Category.FIELD_CATEGORY)
public class Category {

    public static final String FIELD_CATEGORY = "category";

    public static final String FIELD_ID = "id";
    public static final String FIELD_NAME = "name";

    @DatabaseField(columnName = FIELD_ID, generatedId = true)
    private int id;

    @DatabaseField(columnName = FIELD_NAME)
    private String name;

    public Category() {
        //empty
    }

    public Category(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
      return this.name;
    }
}
