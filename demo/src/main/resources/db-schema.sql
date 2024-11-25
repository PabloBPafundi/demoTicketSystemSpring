CREATE TABLE organization (
organization_id INT AUTO_INCREMENT,

organization_name VARCHAR(75),

PRIMARY KEY (organization_id)
);



CREATE TABLE client (

client_id INT AUTO_INCREMENT,

client_name VARCHAR(75),

fk_organization_id INT,

PRIMARY KEY (client_id),

FOREIGN KEY (fk_organization_id) REFERENCES organization(organization_id)

);

CREATE TABLE status (
status_id INT AUTO_INCREMENT,

status_name VARCHAR(150),

PRIMARY KEY (status_id)
);


CREATE TABLE ticket (

ticket_id INT AUTO_INCREMENT,

ticket_title VARCHAR(150),

ticket_description TEXT,

fk_status_id INT,

fk_organization_id INT,

fk_client_id INT,

PRIMARY KEY (ticket_id),

FOREIGN KEY (fk_status_id) REFERENCES status(status_id),

FOREIGN KEY (fk_organization_id) REFERENCES organization(organization_id),

FOREIGN KEY (fk_client_id) REFERENCES client(client_id)
);