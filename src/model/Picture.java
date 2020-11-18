package model;
import java.io.Serializable;
import java.util.Calendar;
import java.util.List;
import java.util.ArrayList;

/**
 * @author Rithvik Aleshetty
 * @author Harsh Patel
 *
 */
public class Picture implements Serializable {
	
	private String photoPath;
	private String caption;
	private Calendar calendar;
	private List <Tag> tags;
	/**
	 * Constructor one for picture
	 * @param photoPath
	 */
	public Picture(String photoPath) {
		this.photoPath = photoPath;
		this.caption="";
		this.calendar = Calendar.getInstance();
		this.calendar.set(Calendar.MILLISECOND, 0);
		this.tags = new ArrayList<Tag>();
	}
	

	/**
	 * ex: location, New Brunswick
	 * @param key
	 * @param value
	 */
	public void addTag(String key, String value) {
		tags.add(new Tag(key, value));
	}
	
	public void editTag() {
		
	}
	
	/**
	 * Return the photo path
	 * @return
	 */
	public String getPhotoPath() {
		return photoPath;
	}
	
	/**
	 * Remove tags from list
	 */
	public void deleteTag() {
		
	}
	
	/**
	 * return the List of tags
	 * @return
	 */
	public List<Tag> getTags(){
		return tags;
	}
	
	/**
	 * Set caption of the photo
	 * @param caption
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}
	
	public String getCaption() {
		return this.caption;
	}
	
	public void setTags(List<Tag> tags) {
		this.tags = tags;
	}
	
	/**
	 * Return the date as a string
	 * @return
	 */
	 public String getDate() {
		 String[] str = calendar.getTime().toString().split("\\s+");
		return str[0] + " " + str[1] + " " + str[2] + ", " + str[5]; 
	 }
	

}
