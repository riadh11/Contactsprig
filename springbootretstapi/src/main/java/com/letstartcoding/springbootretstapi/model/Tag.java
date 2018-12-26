package com.letstartcoding.springbootretstapi.model;
import org.hibernate.annotations.NaturalId;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tags")
public class Tag implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @NaturalId
    private String name;
   /* 
  
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                CascadeType.PERSIST,
                CascadeType.MERGE
            })
    @JoinTable(name = "post_tags",
            joinColumns = { @JoinColumn(name = "tag_id")},
            inverseJoinColumns = { @JoinColumn(name = "post_id") })
     private List<Post> posts = new ArrayList<Post>();



    
       public List<Post> getPosts() {
        		return posts;
        	}
*/
    

    public Tag() {

    }

    public Tag(String name) {
        this.name = name;
    }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	/*public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
*/
    
}