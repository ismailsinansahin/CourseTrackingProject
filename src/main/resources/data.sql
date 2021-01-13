insert into mentors(insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
first_name, last_name, email, password, phone, enabled, country, gender, mentor_working_status)
values('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Alex', 'Ferguson', 'aferguson@mu.com', 'Abc123',
'+15398463219', 'true', 'UK', 'Male','Full Time'),
      ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Zinedine', 'Zidane', 'zzidane@rm.com', 'Abc123',
'+89745631987', 'true', 'Spain', 'Male','Full Time'),
      ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Pep', 'Guardiola', 'pguardiola@mc.com', 'Abc123',
'+65741365789', 'true', 'UK', 'Male','Full Time'),
      ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Hans Dieter', 'Flick', 'hdflick@bm.com', 'Abc123',
'+86319873521', 'true', 'Germany', 'Male','Part Time'),
      ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Thomas', 'Tuchel', 'ttuchel@psg.com', 'Abc123',
'+95135746821', 'true', 'France', 'Male','Part Time');


insert into groups(insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
group_name, group_mascot, mentor_id)
values ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-1', 'Eagles',
       (select m.id from mentors m where m.first_name='Alex')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-2', 'Falcons',
       (select m.id from mentors m where m.first_name='Alex')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-3', 'Hawks',
       (select m.id from mentors m where m.first_name='Zinedine')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-4', 'Panthers',
       (select m.id from mentors m where m.first_name='Zinedine')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Group-5', 'Lions',
       (select m.id from mentors m where m.first_name='Pep'));


insert into students(insert_date_time, insert_user_id, is_deleted, last_update_date_time, last_update_user_id,
first_name, last_name, email, password, phone, enabled, country, gender,
student_working_status, student_status, group_id)
values ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Christiano', 'Ronaldo', 'cronaldo@ju.com', 'Abc123',
       '+15398756325', 'true', 'Italy', 'Male', 'Not working', 'New',
       (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Lionel', 'Messi', 'lmessi@ba.com', 'Abc123',
       '+95135745698', 'true', 'Spain', 'Male', 'Not working', 'New',
       (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Andres', 'Iniesta', 'ainiesta@ba.com', 'Abc123',
       '+96321478951', 'true', 'Spain', 'Male', 'Retaking', 'New',
       (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Franck', 'Ribery', 'fribery@bm.com', 'Abc123',
       '+15987569841', 'true', 'Germany', 'Male', 'Not working', 'New',
       (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Luka', 'Modric', 'lmodric@rm.com', 'Abc123',
       '+32156987412', 'true', 'Spain', 'Male', 'Not working', 'New',
       (select g.id from groups g where group_name='Group-1')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Robert', 'Lewandowski', 'rlewandowski@bm.com', 'Abc123',
       '+33552698774', 'true', 'Germany', 'Male', 'Returning', 'New',
       (select g.id from groups g where group_name='Group-2')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Neymar', 'Neymar', 'nneymar@psg.com', 'Abc123',
       '+59877456669', 'true', 'France', 'Male', 'Not working', 'New',
       (select g.id from groups g where group_name='Group-2')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Kevin', 'De Bruyne', 'kdbruyne@mc.com', 'Abc123',
       '+32155698455', 'true', 'UK', 'Male', 'Returning', 'New',
       (select g.id from groups g where group_name='Group-2')),
       ('2021-01-05 00:00:00', 1, false, '2021-01-05 00:00:00', 1, 'Kylian', 'Mbappe', 'kmbappe@psg.com', 'Abc123',
       '+36985215547', 'true', 'France', 'Male', 'Retaking', 'New',
       (select g.id from groups g where group_name='Group-2'));