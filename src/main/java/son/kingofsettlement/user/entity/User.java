package son.kingofsettlement.user.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import son.kingofsettlement.user.dto.UserStatus;

@Entity
@Getter
@Table(name = "users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	Long id;
	String userEmail;
	String password;
	String sessionId;
	String userNickname;
	String userProfileUrl;
	String userIntroduction;
	String userActivityStatus;
	LocalDateTime createdDttm;
	LocalDateTime updatedDttm;

	public User() {
	}

	public User(String userEmail) {
		this.userEmail = userEmail;
		this.userActivityStatus = UserStatus.INACTIVE.name();
		this.createdDttm = LocalDateTime.now();
		this.updatedDttm = LocalDateTime.now();
	}

	public User(String userEmail, String password, String userNickname) {
		this.userEmail = userEmail;
		this.password = password;
		this.userNickname = userNickname;
		this.userActivityStatus = UserStatus.INACTIVE.name();
		this.createdDttm = LocalDateTime.now();
		this.updatedDttm = LocalDateTime.now();
	}
}
