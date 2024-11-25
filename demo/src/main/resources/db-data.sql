INSERT INTO organization (organization_name) VALUES ('ClienteA');
INSERT INTO organization (organization_name) VALUES ('ClienteB');
INSERT INTO organization (organization_name) VALUES ('ClienteC');


INSERT INTO client (client_name, fk_organization_id) VALUES('Juan', 1);
INSERT INTO client (client_name, fk_organization_id) VALUES('Raul', 1);
INSERT INTO client (client_name, fk_organization_id) VALUES('Juan', 1);
INSERT INTO client (client_name, fk_organization_id) VALUES('Lionel', 1);

INSERT INTO client (client_name, fk_organization_id) VALUES('Mauro', 2);
INSERT INTO client (client_name, fk_organization_id) VALUES('Alberto', 2);

INSERT INTO client (client_name, fk_organization_id) VALUES('Roberto', 3);
INSERT INTO client (client_name, fk_organization_id) VALUES('Juan', 3);

INSERT INTO status (status_name) VALUES ('Sin tomar');
INSERT INTO status (status_name) VALUES ('Tomado');
INSERT INTO status (status_name) VALUES ('Cerrado');

INSERT INTO ticket (ticket_title, ticket_description, fk_status_id, fk_organization_id, fk_client_id) VALUES ('Error al iniciar sesion', 'No puedo iniciar sesion en el sistema CRM', 1, 1, 1);
INSERT INTO ticket (ticket_title, ticket_description, fk_status_id, fk_organization_id, fk_client_id) VALUES ('Error al iniciar sesion', 'No puedo iniciar sesion en el sistema CRM', 1, 1, 2);
INSERT INTO ticket (ticket_title, ticket_description, fk_status_id, fk_organization_id, fk_client_id) VALUES ('Error al iniciar sesion', 'No puedo iniciar sesion en el sistema CRM', 1, 1, 3);

INSERT INTO ticket (ticket_title, ticket_description, fk_status_id, fk_organization_id, fk_client_id) VALUES ('Error al iniciar sesion', 'No puedo iniciar sesion en el sistema CRM', 1, 2, 5);
INSERT INTO ticket (ticket_title, ticket_description, fk_status_id, fk_organization_id, fk_client_id) VALUES ('Error al iniciar sesion', 'No puedo iniciar sesion en el sistema CRM', 1, 2, 6);
INSERT INTO ticket (ticket_title, ticket_description, fk_status_id, fk_organization_id, fk_client_id) VALUES ('Error al iniciar sesion', 'No puedo iniciar sesion en el sistema CRM', 1, 3, 7);

