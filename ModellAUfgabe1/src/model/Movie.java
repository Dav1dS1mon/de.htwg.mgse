package model;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlMixed;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

@XmlRootElement
@XmlType
@XmlAccessorType(XmlAccessType.FIELD)
public class Movie {

	@XmlAttribute(name ="title")
	private String title;
	
	@XmlAttribute(name = "originaltitle")
	private String originaltitle;
	
	@XmlAttribute(name = "duration")
	private String duration;
	
	@XmlAttribute(name = "realse")
	private String release;
	
	@XmlElementWrapper(name="cast")
	@XmlElement(name="member")
	private List<Member> cast;
	
	@XmlElement(name="content")
	private String content;
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}



	public String getOriginaltitle() {
		return originaltitle;
	}



	public void setOriginaltitle(String originaltitle) {
		this.originaltitle = originaltitle;
	}



	public String getDuration() {
		return duration;
	}



	public void setDuration(String duration) {
		this.duration = duration;
	}



	public String getRelease() {
		return release;
	}



	public void setRelease(String release) {
		this.release = release;
	}

	public List<Member> getCast() {
		return cast;
	}

	public void setCast(List<Member> cast) {
		this.cast = cast;
	}

	public static Movie load(InputStream stream) throws IOException{

		 try {
				JAXBContext jaxbContext = JAXBContext.newInstance(Movie.class);
				Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				Movie movie = (Movie) jaxbUnmarshaller.unmarshal(stream);
				stream.close();
				return movie;
			  } catch (Exception e) {
				  throw new IOException("Can´t read movie", e);
			  }
	}
	
@XmlAccessorType(XmlAccessType.NONE)
public static class Member{
	
	@XmlAttribute(name="role")
	private String role;
	
	@XmlValue
	private String name;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
}
