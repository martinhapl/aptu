Subject:
   private Long id;   // PK
    private String shortcut;
    private String name;
    private int hoursOfLectures;
    private int hoursOfSeminars;
    private int hoursOfExercises;
    private int numberOfWeeks;
    private Enums.Lang language;  		// en, cs
    private boolean terminationCredit; 		//  zapocet
    private boolean terminationClasifCredit; 	// klasifikovany zapocet
    private boolean terminationExam; 		// zkouska
    private int credits;
    private int groupSize;

Employee:
    private Long id;     // Pk
    private String name;
    private String surname;
    private String phone;
    private String mobile;
    private String email;       		// unique
    private boolean doctoralStudent;
    private double workingTime;  		// roizsah 0 az 1

StudyGroup
    private Long id;
    private String shortcut;
    private String name;
    private Enums.FormOfStudy formOfStudy;	// P, K
    private Enums.Lang language;		// en, cs
    private Enums.StudyProgram studyProgram;	// bc, mgr

StudyGroupDetail
    private Long id;
    private int yearOfStudy;			// 1, 2, 3
    private Enums.Semester semester;  		// LS, ZS
    private int numberOfStudents;
    private StudyGroup studyGroup;


CREATE TABLE subject
(
  id bigint NOT NULL,
  credits integer NOT NULL,
  groupsize integer NOT NULL,
  hoursofexercises integer NOT NULL,
  hoursoflectures integer NOT NULL,
  hoursofseminars integer NOT NULL,
  language character varying(2) NOT NULL,
  name character varying(255) NOT NULL,
  numberofweeks integer NOT NULL,
  shortcut character varying(20) NOT NULL,
  termination_clasif_credit boolean NOT NULL,
  termination_credit boolean NOT NULL,
  termination_exam boolean NOT NULL,
  CONSTRAINT subject_pkey PRIMARY KEY (id)
)


CREATE TABLE employee
(
  id bigint NOT NULL,
  doctoral_student boolean NOT NULL,
  email character varying(255) NOT NULL,
  mobile character varying(255) NOT NULL,
  name character varying(255) NOT NULL,
  phone character varying(255) NOT NULL,
  surname character varying(255) NOT NULL,
  working_time double precision NOT NULL,
  CONSTRAINT employee_pkey PRIMARY KEY (id)
)

CREATE TABLE studygroup
(

  id bigint NOT NULL,

  form_of_study character varying(1) NOT NULL,

  language character varying(2) NOT NULL,

  name character varying(255) NOT NULL,

  shortcut character varying(20) NOT NULL,

  study_program character varying(3) NOT NULL,

  CONSTRAINT studygroup_pkey PRIMARY KEY (id)

)

CREATE TABLE studygroupdetail
(

  id bigint NOT NULL,

  number_of_students integer NOT NULL,

  semester character varying(2) NOT NULL,

  year_of_study integer NOT NULL,

  study_group_id bigint NOT NULL,

  CONSTRAINT studygroupdetail_pkey PRIMARY KEY (id),

  CONSTRAINT fkkcs0x214p5vh4dr6ca256tyuy FOREIGN KEY (study_group_id)
      REFERENCES studygroup (id) MATCH SIMPLE

      ON UPDATE NO ACTION ON DELETE NO ACTION

)

