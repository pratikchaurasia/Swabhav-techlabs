
select * from regions
select * from countries
select * from locations
---display all regions wise country
select region_name,country_name
from regions left outer join countries 
on regions.region_id=countries.region_id

---display country wise location
select country_name,street_address,city
from countries right outer join locations 
on countries.country_id=locations.country_id

---regions with no country
select region_name,country_name
from regions right outer join countries 
on regions.region_id=countries.region_id
where country_name is null

---countries with no location
select country_name
from countries left outer join locations 
on countries.country_id=locations.country_id
where city is null


---display country name and region name
select country_name,region_name
from regions right outer join countries 
on regions.region_id=countries.region_id

---display country name and region name and location name
select country_name,region_name,city
from regions right outer join countries 
on regions.region_id=countries.region_id
right join locations 
on countries.country_id=locations.country_id


---dept wise jobwise sum of the sal of emp whose sum of sal>2000 and display in order of sal
select deptno,job, count(*) as noOfDept,SUM(sal) as sum
from emp
group by deptno,job
having sum(sal)>2000
order by SUM(sal) asc





---display the full record of swabhav
INSERT INTO locations VALUES( 2000, '1297 laram center', '400009', 'Andheri', NULL, 'IN');

select *
from locations join countries 
on countries.country_id=locations.country_id
join regions 
on regions.region_id=countries.region_id
where location_id=2000
