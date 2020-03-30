CREATE TABLE "User" (
	"id" serial NOT NULL,
	"login" varchar(255) NOT NULL,
	"password" varchar(255) NOT NULL,
	"address" varchar(255) NOT NULL,
	"phone" varchar(255) NOT NULL,
	CONSTRAINT "User_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Account" (
	"uuid" serial NOT NULL,
	"client_id_pk" integer NOT NULL,
	"amount" integer NOT NULL,
	"acc_code" varchar(3) NOT NULL,
	CONSTRAINT "Account_pk" PRIMARY KEY ("uuid")
) WITH (
  OIDS=FALSE
);



CREATE TABLE "Operation" (
	"id" serial NOT NULL,
	"date" varchar(255) NOT NULL,
	"currency" varchar(255) NOT NULL,
	"accFrom" varchar(255) NOT NULL,
	"accTo" varchar(255) NOT NULL,
	"amount" integer NOT NULL,
	"amountBeforeOperation" integer NOT NULL,
	"amountAfterOperation" integer NOT NULL,
	CONSTRAINT "Operation_pk" PRIMARY KEY ("id")
) WITH (
  OIDS=FALSE
);




ALTER TABLE "Account" ADD CONSTRAINT "Account_fk0" FOREIGN KEY ("client_id_pk") REFERENCES "User"("id");

ALTER TABLE "Operation" ADD CONSTRAINT "Operation_fk0" FOREIGN KEY ("id") REFERENCES "Account"("uuid");

