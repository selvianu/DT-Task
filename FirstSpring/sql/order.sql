create table ORDERS ( id int primary key auto_increment, candidate_id int, medicine_id int, qty int, cost int, order_date date , status varchar(50) default 'ORDERED',
constraint candidate_id_fk foreign key(candidate_id) references candidate(id),
constraint medicine_id_fk foreign key ( medicine_id) references medicine(id)
);